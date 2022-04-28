package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;

import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerservice;
	

	@RequestMapping("/customers") // through url we are fonna send request http://localhost:8889
	public List<Customer> getAllCustomer() {//gonna return list // get method
		
		return customerservice.getAllCustomer();
		
	}
	
	

	@RequestMapping(method=RequestMethod.POST,value="/post_customers") //psoting to databases
	public void addSubject(@RequestBody Customer obj) {
		customerservice.addCustomers(obj);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/put_customers/{customerID}")
	public void updateSubject(@PathVariable Long customerID, @RequestBody Customer obj) {
		customerservice.updateCustomers(customerID, obj);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/delete_customer/{customerID}")
	public void deleteSubject(@PathVariable Long customerID) {
		customerservice.deleteSubject(customerID);
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/customer_byID/{customerID}")
	public Optional<Customer> getCus(@PathVariable Long customerID){
		Optional<Customer> emp = customerservice.getCus(customerID);
		return emp;
		
	}
	
	
}
