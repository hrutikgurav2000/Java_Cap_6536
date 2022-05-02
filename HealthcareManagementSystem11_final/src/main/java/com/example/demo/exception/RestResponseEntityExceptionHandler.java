package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(GlobalExceptionHandler.class)
	public ResponseEntity<ErrorDetails> GlobalExceptionHandler(GlobalExceptionHandler exception,WebRequest request) {
		ErrorDetails message=new ErrorDetails(HttpStatus.NOT_FOUND,exception.getMessage());
	  return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
}
	/*
	@ExceptionHandler(ForeignKeyException.class)
	public ResponseEntitiy<ErrorDetails> ForeignKeyException(ForeignKeyException exception, WebRequest request){
		ErrorDetails message=new ErrorDetails(HttpStatus.NOT_FOUND,exception.getMessage());
		  return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	}*/
}
