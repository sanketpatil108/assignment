package com.example.excp;

public class ResourceNotFoundException extends Exception {
	
	String message;
	
	public ResourceNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	

}
