package com.springsec.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springsec.test.model.User;
import com.springsec.test.model.UserDetailsImpl;
import com.springsec.test.repo.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user=userRepository.findByUserName(username);
		
		if(user == null) {
			System.out.println("Exception thrown");
			
			throw new UsernameNotFoundException(user+" not found");
		}
		
		return new UserDetailsImpl(user);
	}
	
	
	
	

}
