package com.foodservices.abhikitchen.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class )
	public final ResponseEntity<ErrorDetails> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
	ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),
			ex.getMessage(),request.getDescription(false));
	return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(MenuNotFoundException.class )
	public final ResponseEntity<ErrorDetails> handleUserNotFoundExceptions(Exception ex, WebRequest request) throws Exception {
	ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),
			ex.getMessage(),request.getDescription(false));
	return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.NOT_FOUND);
	}
}
