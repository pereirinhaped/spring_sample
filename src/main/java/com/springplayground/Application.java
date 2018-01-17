package com.springplayground;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springplayground.config.AppConfig;
import com.springplayground.model.User;
import com.springplayground.service.UserService;


public class Application {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
	
		UserService service = appContext.getBean("userService", UserService.class);
		
		List<User> users = service.getUsers();
		for (User u : users)
			System.out.println(u);
	}
	
	
	
}
