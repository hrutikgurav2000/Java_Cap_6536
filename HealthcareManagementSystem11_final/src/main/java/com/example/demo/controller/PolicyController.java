package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Policy;
import com.example.demo.service.PolicyService;

@RestController
public class PolicyController {
	@Autowired
	PolicyService poliservice;

		//post method to add new policy
		@PostMapping("/postpolicy/")
		public Policy savepolicy(@RequestBody Policy policy) {
			return poliservice.savepolicy(policy);
		}
		
		//get all details
		@GetMapping("/getpolicy/")
		public List fetchPolicy(){
			return poliservice.fetchPolicy();
		}
		//get by id
		@GetMapping("/getpolice/{id}")
		public Policy fetchPolicyById(@PathVariable("id")int policyid) {
			
			return ( poliservice.fetchPolicyById(policyid));
					
		}
		//update
		@PutMapping("/policyupdate/{id}")
		public Policy updatePolicy(@PathVariable("id")int policyid,@RequestBody Policy policy) {
			return poliservice.updatePolicy(policyid, policy);
			
		}
		//delete by id
		@DeleteMapping("/deletepolicy/{id}")
		public String deletePolicyById(@PathVariable("id") int policyid) {
			poliservice.deleteByPolicyById(policyid);
			return  "particular policy's detail has been deleted successfully";
	
		}
}	
	
