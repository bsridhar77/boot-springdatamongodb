package com.anthem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anthem.model.User;
import com.anthem.repository.UserRepository;

@RestController
@RequestMapping("/quote")
public class QuoteService {

  @Autowired
  UserRepository userRepository;
  @RequestMapping(value = "", method = RequestMethod.GET)
  public String getAllQuotes() {
	  
	  
	  return "Hai";
  }

  @RequestMapping(value = "/{isbn}", method = 
    RequestMethod.GET)
  public String getQuote(@PathVariable String isbn) {
	  return "Hello" + isbn;
	  
  }
}