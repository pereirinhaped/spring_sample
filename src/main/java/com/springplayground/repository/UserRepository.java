package com.springplayground.repository;

import java.util.List;

import com.springplayground.model.User;

public interface UserRepository {

	List<User> getUsers();

}