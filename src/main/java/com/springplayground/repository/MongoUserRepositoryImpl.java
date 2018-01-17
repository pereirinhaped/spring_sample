package com.springplayground.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springplayground.model.User;

public interface MongoUserRepositoryImpl extends MongoRepository<User, String> {

}
