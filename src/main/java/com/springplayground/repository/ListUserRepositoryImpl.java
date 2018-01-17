package com.springplayground.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springplayground.model.User;

@Repository("userRepository")
public class ListUserRepositoryImpl implements UserRepository {
	
	@Override
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		
		users.add(new User("Pedro", "Pereirinha"));
		users.add(new User("Leia", "von Dory"));
		
		return users;
	}
	
	
}
