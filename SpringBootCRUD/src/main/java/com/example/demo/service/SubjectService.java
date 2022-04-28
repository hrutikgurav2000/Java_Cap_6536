package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.bean.Subject;
import com.example.demo.repository.SubjectRepository;

// this shoul be autowired to controller
// we will crewate object herer
//implementation of method
@Service
public class SubjectService {

	@Autowired
	SubjectRepository subjectrepository;
	
	
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		List<Subject> subjects = new ArrayList<Subject>();
		
		subjectrepository.findAll().forEach(subjects::add); //stream api
		return subjects;
	}

	@RequestMapping(method=RequestMethod.POST,value="/subjects")
	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		subjectrepository.save(subject);
		
	}

	@RequestMapping(method=RequestMethod.PUT,value="/subjects/{id}")
	public void updateSubject(Integer id , Subject subject) {
		// TODO Auto-generated method stub
		subjectrepository.save(subject);
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/subjects/{id}")
	public void deleteSubject(Integer id) {
		// TODO Auto-generated method stub
		subjectrepository.deleteById(id);
	}

}
