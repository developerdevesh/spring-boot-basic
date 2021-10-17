package com.springsec.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springsec.test.model.User;

public interface IUserService {

	public List<User> findAllUsers();

	public Optional<User> findUserById(int id);

	public User findUserName(String userName);
}
