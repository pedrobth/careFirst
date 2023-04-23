package com.carefirst.employeeapi.controllers.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler{

	@ExceptionHandler
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<Object> handleNotFoundException(NotFoundException ex){
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);		
	}

}
