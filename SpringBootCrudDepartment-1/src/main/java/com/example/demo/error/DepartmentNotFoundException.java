package com.example.demo.error;



@SuppressWarnings("serial")
public class DepartmentNotFoundException extends Exception {
	public DepartmentNotFoundException(String string) {
	 super(string);
	}
}
