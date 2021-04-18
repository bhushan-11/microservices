package com.bhushan.microservices.demo.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {

	
	private Integer userid;
	
	@Size(min = 2,message = "Username shourld have ateleast 2 characters")
	private String userName;
	
	
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", userName=" + userName + ", dateofBirth=" + dateofBirth + "]";
	}

	public User(Integer userid, String userName, Date dateofBirth) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.dateofBirth = dateofBirth;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
@Past
	private Date dateofBirth;
	
	protected User () {
		
	}


	
	
}
