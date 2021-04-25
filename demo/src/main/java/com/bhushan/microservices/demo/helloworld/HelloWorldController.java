package com.bhushan.microservices.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{
	

	@GetMapping("/hello-world")
	public String HelloWorldString() {
		
		return "Hello Bhushan ! ";
	}
	
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean HelloWorldBeanMethod() {
		
		return new HelloWorldBean("Hi Bhushan from Hello world bean");
	}
	
	
	@GetMapping("/hello-world/path-variable/{name}")
	public String HelloWorldPathVariable(@PathVariable String name) {
		
		return "Hello World from " + name;
	}
	
	
	
	
}


	

