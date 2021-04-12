package com.bhushan.microservices.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	//retriveAllUsers
	
	@Autowired
	UserDaoService userDaoService;
	
	@GetMapping(path="/getAll")
	public List<User> retrieveAll(){
		
		return userDaoService.findAll();
		
		
	}
	
	//retriverUser(int id)
	
	@GetMapping(path="/getOne/{id}")
	public User retrieveOne(@PathVariable int id) {
		
		return userDaoService.findOne(id);
	}

}
