package com.springplayground.controller;

import com.springplayground.model.User;

public interface UserController {

	String greetUser();

	String greetUser(User user);

}