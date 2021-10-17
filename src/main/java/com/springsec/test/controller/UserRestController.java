package com.springsec.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsec.test.model.User;
import com.springsec.test.service.UserService;

@RestController
@RequestMapping("/v1")
public class UserRestController {

	@Autowired
	UserService userService;
	
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		
		return userService.findAllUsers();
	}

}
