package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;


public class GlobalExceptionHandler extends Exception{
	
		public GlobalExceptionHandler(String string) {
			super(string);
		}
	
	
}
