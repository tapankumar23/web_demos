package com.tap.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tap.backend.models.User;
import com.tap.backend.service.UserService;

@RestController
@RequestMapping("/user")
public class UserControllers {

	@Autowired UserService userService;
	
	@RequestMapping(value="/register", method=RequestMethod.POST) 
	public User registerUser(@RequestBody User user) {
		return null;
	}
}
