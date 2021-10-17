package com.springsec.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsec.test.model.User;
import com.springsec.test.repo.UserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	UserRepository userRepository;

	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	public Optional<User> findUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	public User findUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(userName);
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User updateUser(int id, User user) {
		Optional<User> retrievedUser = userRepository.findById(id);
		if (retrievedUser.isPresent()) {
			userRepository.save(user);
		} else {

			try {
				throw new Exception("User not found:" + id);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return userRepository.findById(id).get();
	}

	public User deleteUser(int userId) {
		Optional<User> retrievedUser = userRepository.findById(userId);
		if (retrievedUser.isPresent()) {
			userRepository.deleteById(userId);
		} else {

			try {
				throw new Exception("User not found:" + userId);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return retrievedUser.get();
		
	}
	
}
