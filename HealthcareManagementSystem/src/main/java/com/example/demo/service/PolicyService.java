package com.example.demo.service;



import java.util.List;

import com.example.demo.entity.Policy;

public interface PolicyService {

	Policy savepolicy(Policy policy);

	List fetchPolicy();

	Policy fetchPolicyById(int policyid);

	Policy updatePolicy(int policyid, Policy policy);

	void deleteByPolicyById(int policyid);

}
