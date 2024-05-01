package com.example.demo.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler{
	
	

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException ex) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError error = new StandardError(new Date(), status.value(), "Resource Not Found",
				ex.getMessage(), "Resource Not Found");
		return ResponseEntity.status(status).body(error);
	}
}