package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired  //propertybased
	private DepartmentService departmentService;
//save
	//Loggers are helpful for debugging application
		@SuppressWarnings("unused")
		private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

	
	@PostMapping("/departments/")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	//get all departments Record
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
		return departmentService.fetchDepartList();
	}
	
	//get department by id
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long did) throws DepartmentNotFoundException {
		LOGGER.info("Inside Department fetchDepartmentById");

		return departmentService.fetchDepartmentById(did);
	}
	
	//delete
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long did) {
		departmentService.deleteDepartmentById(did);
		return "Department deleted Successfully";
	}
	
	//update
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") Long did,@RequestBody Department department) {
		return departmentService.updateDepartment(did,department);
	}
	
	//byname
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
		return departmentService.fetchDepartmentByName(departmentName);
	}
	
}
	