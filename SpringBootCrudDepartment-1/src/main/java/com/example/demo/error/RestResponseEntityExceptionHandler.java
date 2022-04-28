package com.example.demo.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.entity.ErrorMessage;

/*
 * @RequestMapping(method=RequestMethod.GET, value="employees/{id}")
	public Optional<Employee> getEmp(@PathVariable Integer id){
		Optional<Employee> emp = empservice.getEmp(id);
		return emp;
	}
controller
@RequestMapping(method=RequestMethod.GET, value="employees/{id}")
	public Optional<Employee> getEmp(Integer id) {
		Optional<Employee> emp = repo.findById(id);
		return emp;
	}
 */

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
    @ExceptionHandler(DepartmentNotFoundException.class)
	public ResponseEntity<ErrorMessage> departmentNotFoundException(DepartmentNotFoundException exception,WebRequest request) {
		ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());
	  return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
}
