package com.bhushan.microservices.demo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	
	private static List<User> users= new ArrayList<User>();
	
	private static int userCount=5;
	
	static {
	users.add(new User(1, "Bhushan", new Date()));
	users.add(new User(2, "Vidya", new Date()));

	users.add(new User(3, "Vaidehi", new Date()));

	users.add(new User(4, "Suwarna", new Date()));

	
	}
	
	public List<User> findAll(){
		
		return users;
	}
	
	public User saveUser(User user) {
		if(user.getUserid() == null) {
			user.setUserid(++ userCount);
		}
		
		users.add(user);
		
		return user;
	}
	
	public User findOne(int id) {
		
		for(User user: users) {
			if(user.getUserid()== id) {
				return user;
			}
		}
		
		return null;
	}
	
public User deletebyId(int id) {
		
	Iterator<User> iterator = users.iterator();
	while(iterator.hasNext()) {
		
		User user = iterator.next();
		if(user.getUserid()== id) {
			iterator.remove(); //delete user from the static list
			
			return user;
		}
	}
	
		return null;
	}


	
}
