package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartList();

	public Department fetchDepartmentById(Long did) throws DepartmentNotFoundException;

	public void deleteDepartmentById(Long did);

	public Department updateDepartment(Long did, Department department);

	public Department fetchDepartmentByName(String departmentName);

	}
