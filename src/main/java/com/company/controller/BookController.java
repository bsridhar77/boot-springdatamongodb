package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.User;
import com.company.repository.UserRepository;

@RestController
@RequestMapping("/books")
public class BookController {

  @Autowired
  UserRepository userRepository;
  @RequestMapping(value = "", method = RequestMethod.GET)
  public List<User> getAllBooks() {
      List<User> userList=userRepository.findAll();
      return userList;
  }

  @RequestMapping(value = "/{userName}", method =RequestMethod.GET)
  public User getUser(@PathVariable String userName) {
	  return userRepository.findUserByUserName(userName);
  }
  
  @RequestMapping(value = "", method =RequestMethod.POST)
  public User saveUser(@RequestBody User user ,BindingResult result, ModelMap model) {
	  System.out.println("username is:" + user.getUserName());
	  System.out.println("firstName is:" + user.getFirstName());
	  System.out.println("lastName is:" + user.getLastName());
	  return userRepository.insert(user);
  }
  

  @RequestMapping(value = "/{userName}", method =RequestMethod.DELETE)
  public long deleteUser(@PathVariable String userName) {
	  return userRepository.deleteUserByUserName(userName);
  }
}
