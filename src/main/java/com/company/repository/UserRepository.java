package com.company.repository;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.company.model.User;

public interface UserRepository extends MongoRepository<User, BigInteger> {
    // 
	User findUserByUserName(String userName);
	long deleteUserByUserName(String userName);
};