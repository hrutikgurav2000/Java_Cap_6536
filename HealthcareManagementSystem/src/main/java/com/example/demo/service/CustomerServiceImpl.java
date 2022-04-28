package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerrepo;

	@Override
	public Customer savecust(Customer cust) {
		return customerrepo.save(cust);
	}

	@Override
	public List<Customer> fetchCustomer() {
		return customerrepo.findAll();
	}

	//get by id
	@Override
	public Customer fetchCustomerById(int customerID) {
		return customerrepo.findById(customerID).get();
	}

	//put method
	@Override
	public Customer updateCustomer(int customerID, Customer customer) {
		Customer updatecustomerdb = customerrepo.findById(customerID).get();
		if(Objects.nonNull(customer.getCustname())&&!"".equalsIgnoreCase(customer.getCustname())) {
			updatecustomerdb.setCustname(customer.getCustname());
		}
		if(Objects.nonNull(customer.getCustmailid())&&!"".equalsIgnoreCase(customer.getCustmailid())) {
			updatecustomerdb.setCustmailid(customer.getCustmailid());
		}
		if(Objects.nonNull(customer.getPhonenumb())) {
			updatecustomerdb.setPhonenumb(customer.getPhonenumb());
		}
		if(Objects.nonNull(customer.getAadhar())) {
			updatecustomerdb.setAadhar(customer.getAadhar());
		}
		if(Objects.nonNull(customer.getCustpwsd())&&!"".equals(customer.getCustpwsd())) {
			updatecustomerdb.setCustpwsd(customer.getCustpwsd());
		}
		return customerrepo.save(updatecustomerdb);
	}
	
	
	@Override
	public void deleteCustomerById(int customerID) {
			customerrepo.deleteById(customerID);
	}


}