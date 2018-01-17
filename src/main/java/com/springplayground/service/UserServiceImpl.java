package com.springplayground.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springplayground.model.User;
import com.springplayground.repository.MongoUserRepositoryImpl;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private MongoUserRepositoryImpl userRepository;
	
	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public void addUser(String firstName, String lastName) {
		
		User newUser = new User(firstName, lastName);
		userRepository.insert(newUser);
	}
}
