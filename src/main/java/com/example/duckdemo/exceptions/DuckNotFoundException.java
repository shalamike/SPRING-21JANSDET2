package com.example.duckdemo.exceptions;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

<<<<<<< HEAD
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "thats not a duck... DUCK!!!!!")
=======
//@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "A duck was not found, QUACK!!!")
>>>>>>> upstream/main
public class DuckNotFoundException extends EntityNotFoundException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6705326510114331656L;

	public DuckNotFoundException() {
		super(); // calls EntityNotFoundException()
	}

	public DuckNotFoundException(String message) {
		super(message); // calls EntityNotFoundException(String message)
	}

	
}
