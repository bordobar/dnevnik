package com.iktpreobuka.dnevnik.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.dnevnik.repositories.UserRepository;
import com.iktpreobuka.dnevnik.entities.UserEntity;

@RestController
@RequestMapping(path = "/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(path = "/all", method = RequestMethod.GET)
	public Iterable<UserEntity> getAllUsers() {
	return userRepository.findAll();
	}

}
