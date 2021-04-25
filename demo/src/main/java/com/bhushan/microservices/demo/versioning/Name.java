package com.bhushan.microservices.demo.versioning;

public class Name {

	private String fistName;
	
	private String lastName;

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Name(String fistName, String lastName) {
		super();
		this.fistName = fistName;
		this.lastName = lastName;
	}

	public Name() {
		// TODO Auto-generated constructor stub
		super();
	}
	
}
