package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.demo.entity.HealthCare;
import com.example.demo.service.PolicyService;



@RestController
public class PolicyController {
	@Autowired
	private PolicyService policyservice;
	

	@RequestMapping("/policy") // through url we are fonna send request http://localhost:8889
	public List<HealthCare> getAllpolicy() {//gonna return list // get method
		
		return policyservice.getAllpolicy();
		
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/post_policy") //psoting to databases
	public void addSubject(@RequestBody HealthCare obj) {
		policyservice.addSubject(obj);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/post_policy/{policyID}")
	public void updateSubject(@PathVariable Long policyID, @RequestBody HealthCare obj) {
		policyservice.updateSubject(policyID, obj);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/delete_policy/{policyID}")
	public void deleteSubject(@PathVariable Long policyID) {
		policyservice.deleteSubject(policyID);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/policy/{policyID}")
	public Optional<HealthCare> getEmp(@PathVariable Long policyID){
		Optional<HealthCare> emp = policyservice.getEmp(policyID);
		return emp;
		
	}
}
