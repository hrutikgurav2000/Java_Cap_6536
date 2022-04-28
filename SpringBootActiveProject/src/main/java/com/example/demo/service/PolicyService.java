package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.HealthCare;
import com.example.demo.repository.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	PolicyRepository policyrepository;
	
	

	public List<HealthCare> getAllpolicy() {
		// TODO Auto-generated method stub
		List<HealthCare> subjects = new ArrayList<HealthCare>();
		
		policyrepository.findAll().forEach(subjects::add); //stream api
		return subjects;
	}


	@RequestMapping(method=RequestMethod.POST,value="/post_policy")
	public void addSubject(HealthCare obj) {
		// TODO Auto-generated method stub
		policyrepository.save(obj);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/post_policy/{policyID}")
	public void updateSubject(Long policyID, HealthCare obj) {
		// TODO Auto-generated method stub
		policyrepository.save(obj);
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/delete_policy/{policyID}")
	public void deleteSubject(Long policyID) {
		// TODO Auto-generated method stub
		policyrepository.deleteById(policyID);
	}

	@RequestMapping(method=RequestMethod.GET, value="/policy/{policyID}")
	public Optional<HealthCare> getEmp(Long policyID) {
		Optional<HealthCare> obj = policyrepository.findById(policyID);
		return obj;
	}



}
