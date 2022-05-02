package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customerID")
	private int customerID;
	private String customerName;
	private String customerMailId;
	private long customerPhoneNumber;
	private long customerAadhar;
	private String customerPassword;

	@JsonIgnore
	 @OneToMany(mappedBy="customer",cascade = CascadeType.ALL)
	//@JoinColumn(name = "fk_policy")
	
	 
	 List<Policy> lp=new ArrayList<Policy>();


	public Customer() {
		super();
	}


	public Customer(int customerID, String customerName, String customerMailId, long customerPhoneNumber, long customerAadhar, String customerPassword,
			Set<Policy> policy, List<Policy> lp) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerMailId = customerMailId;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerAadhar = customerAadhar;
		this.customerPassword = customerPassword;
	//	this.policy = policy;
		this.lp = lp;
	}


	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getcustomerName() {
		return customerName;
	}


	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getcustomerMailId() {
		return customerMailId;
	}


	public void setcustomerMailId(String customerMailId) {
		this.customerMailId = customerMailId;
	}


	public long getcustomerPhoneNumber() {
		return customerPhoneNumber;
	}


	public void setcustomerPhoneNumber(long customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}


	public long getcustomerAadhar() {
		return customerAadhar;
	}


	public void setcustomerAadhar(long customerAadhar) {
		this.customerAadhar = customerAadhar;
	}


	public String getcustomerPassword() {
		return customerPassword;
	}


	public void setcustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

/*
	public Set<Policy> getPolicy() {
		return policy;
	}


	public void setPolicy(Set<Policy> policy) {
		this.policy = policy;
	}
*/

	public List<Policy> getLp() {
		return lp;
	}


	public void setLp(List<Policy> lp) {
		this.lp = lp;
	}


	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerMailId=" + customerMailId
				+ ", customerPhoneNumber=" + customerPhoneNumber + ", customerAadhar=" + customerAadhar + ", customerPassword=" + customerPassword + ", lp=" + lp + "]";
	}


	
		
		
		
	
		
}
