package com.bhushan.microservices.demo.exception;

import java.util.Date;

public class ExceptionResponse {

	//creating our own customized response that will be returned when excepiton occurs 
	
	private Date timestamp;
	
	private String message;
	
	private String details;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	

	public ExceptionResponse(Date timestamp2, String message2, String description) {
		// TODO Auto-generated constructor stub
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	@Override
	public String toString() {
		return "ExceptionResponse [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
	}
	
	
}
