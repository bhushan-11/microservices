package com.bhushan.microservices.demo.user;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;






@RestController
public class UserResource {
	
	//retriveAllUsers
	
	@Autowired
	UserDaoService userDaoService;
	
	@GetMapping(path="/users/all")
	public List<User> retrieveAll(){
		
		return userDaoService.findAll();
		
		
	}
	
	//retriverUser(int id)
	
	@GetMapping(path="/users/{id}")
	public User retrieveOne(@PathVariable int id) {
		
		User foundUser= userDaoService.findOne(id);
		
		if(foundUser == null) {
			throw new UserNotFoundException("id - "+ id);
		}
		
	//Resource<User> resource = new Resource<User>(user);
//		
//		Resource
		
		return foundUser;
		
		
	}
	
    @DeleteMapping(path="/users/{id}")
	public void deleteUser(@PathVariable int id) {
		
		User foundUser= userDaoService.deletebyId(id);
		
		if(foundUser == null) {
			throw new UserNotFoundException("id - "+ id);
		}
				
		
	}
	
	
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		
		User user2 = userDaoService.saveUser(user);
		
	URI location =ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
		.buildAndExpand(user2.getUserid())
		.toUri();
	
	return ResponseEntity.created(location).build();
	}

}
