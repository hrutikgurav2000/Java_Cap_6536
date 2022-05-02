package com.example.demo.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "p_id")
	private int policyid;
	private String policyname;
	private String policytype;
	private int policytenure;
	
	//@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;
	public Policy() {
		super();
	}
	
public Policy(int policyid, String policyname, String policytype, int policytenure, Customer customer) {
		super();
		this.policyid = policyid;
		this.policyname = policyname;
		this.policytype = policytype;
		this.policytenure = policytenure;
		this.customer = customer;
	}

public int getPolicyid() {
	return policyid;
}

public void setPolicyid(int policyid) {
	this.policyid = policyid;
}

public String getPolicyname() {
	return policyname;
}

public void setPolicyname(String policyname) {
	this.policyname = policyname;
}

public String getPolicytype() {
	return policytype;
}

public void setPolicytype(String policytype) {
	this.policytype = policytype;
}

public int getPolicytenure() {
	return policytenure;
}

public void setPolicytenure(int policytenure) {
	this.policytenure = policytenure;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

@Override
public String toString() {
	return "Policy [policyid=" + policyid + ", policyname=" + policyname + ", policytype=" + policytype
			+ ", policytenure=" + policytenure + ", customer=" + customer + "]";
}


//	private Cutomer 
	/*
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_customer")
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Policy() {
		super();
	}
	*/
	

}