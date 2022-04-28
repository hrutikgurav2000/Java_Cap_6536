package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService {


	Customer savecust(Customer cust);

	List<Customer> fetchCustomer();

	Customer fetchCustomerById(int customerID);

	Customer updateCustomer(int customerID,Customer customer);

	void deleteCustomerById(int customerID);

		
}
