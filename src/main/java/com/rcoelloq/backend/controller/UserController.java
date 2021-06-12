package com.rcoelloq.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcoelloq.backend.dao.UserRepository;
import com.rcoelloq.backend.model.User;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class UserController {
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/getallusers")
	public List<User> listOfUsers() {
		return userRepo.findAll();
	}

}
