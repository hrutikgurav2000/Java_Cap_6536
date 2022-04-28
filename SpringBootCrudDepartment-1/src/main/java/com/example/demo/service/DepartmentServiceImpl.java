package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}
	@Override
	public List<Department> fetchDepartList() {
		return departmentRepository.findAll();
	}/*
	@Override
	public Department fetchDepartmentById(Long did) {
		return departmentRepository.findById(did).get();
	}*/
	@Override
	public void deleteDepartmentById(Long did) {
	 departmentRepository.deleteById(did);
		
	}
	
	@Override
	public Department updateDepartment(Long did, Department department) {
		Department depDB=departmentRepository.findById(did).get();
		if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depDB.setDepartmentName(department.getDepartmentName());
			
		}
		if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			depDB.setDepartmentAddress(department.getDepartmentAddress());
			System.out.println(department.getDepartmentAddress());
		}
		return departmentRepository.save(depDB);
	}
	
	@Override
	public Department fetchDepartmentByName(String departmentName) {
		return departmentRepository.findByDepartmentName(departmentName);
	}
	
	@Override
	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
		//return departmentRepository.findById(did).get();
		

			Optional<Department> department=departmentRepository.findById(departmentId);
			
			if(!department.isPresent()) {
				throw new DepartmentNotFoundException("Department  not available");
			}
			else return department.get();
		}

}
	