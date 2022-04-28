package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Customer;

import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository  customerrepository;
	
	
	// through url we are fonna send request http://localhost:8889
	@RequestMapping("/customers") 
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> sub = new ArrayList<Customer>();
		
		customerrepository.findAll().forEach(sub::add); //stream api
		return sub;
	}

	@RequestMapping(method=RequestMethod.POST,value="/post_customers")
	public void addCustomers(Customer obj) {
		// TODO Auto-generated method stub
		customerrepository.save(obj);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/put_customers/{customerID}")
	public void updateCustomers(Long customerID, Customer obj) {
		// TODO Auto-generated method stub
		customerrepository.save(obj);
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/delete_customer/{customerID}")
	public void deleteSubject(Long customerID) {
		// TODO Auto-generated method stub
		customerrepository.deleteById(customerID);
	}

	@RequestMapping(method=RequestMethod.GET, value="/customer_byID/{customerID}")
	public Optional<Customer> getCus(Long customerID) {
		// TODO Auto-generated method stub
		Optional<Customer> obj = customerrepository.findById(customerID);
		return obj;
	}
	
	

}
