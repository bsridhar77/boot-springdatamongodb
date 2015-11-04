package com.company.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.model.User;
import com.company.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class UserRepositoryTest {

	 	@Autowired
	    private UserRepository userRepository;
	
	 	/*
	 	@Test
	 	public void saveUser(){
	 		
	 		  User user = new User();
	         user.setFirstName("Sridhar");
	         user.setLastName("Lincoln");
	         user.setUserName("alincoln");
	         userRepository.save(user);
	 	}*/
}
