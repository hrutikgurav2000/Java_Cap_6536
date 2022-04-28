package com.example.demo.service;


import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Policy;
import com.example.demo.repository.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	PolicyRepository policyrepo;

	@Override
	public Policy savepolicy(Policy policy) {
		return policyrepo.save(policy);
	}

	@Override
	public List<Policy> fetchPolicy() {
		return policyrepo.findAll();
	}
	

	@Override
	public Policy fetchPolicyById(int policyid) {
		return policyrepo.findById(policyid).get();
	}

	@Override
	public Policy updatePolicy(int policyid, Policy policy) {
		Policy updatepolicy = policyrepo.findById(policyid).get();
		if(Objects.nonNull(policy.getPolicyname())&&!"".equalsIgnoreCase(policy.getPolicyname())) {
			updatepolicy.setPolicyname(policy.getPolicyname());
		}
		if(Objects.nonNull(policy.getPolicytype())&&!"".equalsIgnoreCase(policy.getPolicytype())) {
			updatepolicy.setPolicytype(policy.getPolicytype());
		}
		if(Objects.nonNull(policy.getPolicytenure())) {
			updatepolicy.setPolicytenure(policy.getPolicytenure());
		}
		return policyrepo.save(updatepolicy);

	}

	@Override
	public void deleteByPolicyById(int policyid) {
		policyrepo.deleteById(policyid);
	}

}
