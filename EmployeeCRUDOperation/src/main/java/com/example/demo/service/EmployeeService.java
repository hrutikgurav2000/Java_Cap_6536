package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.bean.Employee;

import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeerepository;
	
	
	public List<Employee> getAllSubjects() {
		// TODO Auto-generated method stub
		List<Employee> emps = new ArrayList<Employee>();
		employeerepository.findAll().forEach(emps::add);
		return emps;
	}

	@RequestMapping(method=RequestMethod.POST,value="/employees")
	public void addSubject(Employee employee) {
		// TODO Auto-generated method stub
		employeerepository.save(employee);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/employees/{eid}")
	public void updateSubject(Integer eid, Employee employee) {
		// TODO Auto-generated method stub
		employeerepository.save(employee);
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/employees/{eid}")
	public void deleteSubject(Integer eid) {
		// TODO Auto-generated method stub
		employeerepository.deleteById(eid);
	}

	@RequestMapping(method=RequestMethod.GET, value="employees/{id}")
	public Optional<Employee> getEmp(Integer id) {
		Optional<Employee> emp = employeerepository.findById(id);
		return emp;
	}

}
