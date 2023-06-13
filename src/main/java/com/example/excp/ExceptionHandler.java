package com.example.excp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(value= ResourceNotFoundException.class)
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	public String getMessage() {
		
		return "Resource Not Found";
	}
	
	

}
