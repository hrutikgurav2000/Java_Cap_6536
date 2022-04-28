package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
