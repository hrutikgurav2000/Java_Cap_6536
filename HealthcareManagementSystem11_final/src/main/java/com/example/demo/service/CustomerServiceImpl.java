package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.exception.GlobalExceptionHandler;
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
	public Customer fetchCustomerById(int customerID) throws GlobalExceptionHandler {
		//return customerrepo.findById(customerID).get();
		Optional<Customer> customer = customerrepo.findById(customerID);
		if(!customer.isPresent()) {
			throw new GlobalExceptionHandler("Student not available");
		}
		else return customer.get();
		
	}

	//put method
	@Override
	public Customer updateCustomer(int customerID, Customer customer) {
		Customer updatecustomerdb = customerrepo.findById(customerID).get();
		if(Objects.nonNull(customer.getcustomerName())&&!"".equalsIgnoreCase(customer.getcustomerName())) {
			updatecustomerdb.setcustomerName(customer.getcustomerName());
		}
		if(Objects.nonNull(customer.getcustomerMailId())&&!"".equalsIgnoreCase(customer.getcustomerMailId())) {
			updatecustomerdb.setcustomerMailId(customer.getcustomerMailId());
		}
		if(Objects.nonNull(customer.getcustomerPhoneNumber())) {
			updatecustomerdb.setcustomerPhoneNumber(customerID);
		}
		if(Objects.nonNull(customer.getcustomerAadhar())) {
			updatecustomerdb.setcustomerAadhar(customer.getcustomerAadhar());
		}
		if(Objects.nonNull(customer.getcustomerPassword())&&!"".equals(customer.getcustomerPassword())) {
			updatecustomerdb.setcustomerPassword(customer.getcustomerPassword());
			
		}
		return customerrepo.save(updatecustomerdb);
	}
	
	
	@Override
	public void deleteCustomerById(int customerID) {
			customerrepo.deleteById(customerID);
	}


}