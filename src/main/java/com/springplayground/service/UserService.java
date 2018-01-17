package com.springplayground.service;

import java.util.List;

import com.springplayground.model.User;

public interface UserService {
	
	public List<User> getUsers();
	public void addUser(String firstName, String lastName);
	
}