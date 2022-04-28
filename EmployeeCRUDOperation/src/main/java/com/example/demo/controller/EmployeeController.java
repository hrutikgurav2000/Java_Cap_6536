package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;

import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;

	@RequestMapping("/employees") // through url we are fonna send request http://localhost:8889
	public List<Employee> getAllSubjects() {//gonna return list // get method
		
		
		return employeeservice.getAllSubjects();
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/employees") //psoting to databases
	public void addSubject(@RequestBody Employee employee) {
		employeeservice.addSubject(employee);
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/employees/{eid}")
	public void updateSubject(@PathVariable Integer eid, @RequestBody Employee employee) {
		employeeservice.updateSubject(eid, employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/employees/{eid}")
	public void deleteSubject(@PathVariable Integer eid) {
		employeeservice.deleteSubject(eid);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="employees/{id}")
	public Optional<Employee> getEmp(@PathVariable Integer id){
		Optional<Employee> emp = employeeservice.getEmp(id);
		return emp;
	}
/*
 * controller
@RequestMapping(method=RequestMethod.GET, value="employeesbyname/{name}")
	public Employee getEmpByName(String name) {
		List<Employee> emps = (List<Employee>) repo.findAll();
		Employee emp = null;
		for(Employee e : emps) {
			if(e.getName().equals(name))
				emp = e;
		}
		return emp;
	}

 */
	
}
