package com.springplayground.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springplayground.model.User;

@Controller("userController")
public class UserControllerImpl implements UserController {
	
	@Override
	@RequestMapping("/greet")
	public String greetUser() {
		return "Hello to you!";
	}
	
	@Override
	public String greetUser(User user) {
		return "Hello, " + user.getFirstName() + "!!";
	}
	
}
