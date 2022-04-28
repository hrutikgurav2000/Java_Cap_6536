package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "c_id")
	private int customerID;
	private String custname;
	private String custmailid;
	private long phonenumb;
	private long aadhar;
	private String custpwsd;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_policy")
	private Policy policy;
	
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	public Customer() {
		super();
	}
	public Customer(int customerID, String custname, String custmailid, long phonenumb, long aadhar, String custpwsd) {
		super();
		this.customerID = customerID;
		this.custname = custname;
		this.custmailid = custmailid;
		this.phonenumb = phonenumb;
		this.aadhar = aadhar;
		this.custpwsd = custpwsd;
	}
	public int getCustid() {
		return customerID;
	}
	public void setCustid(int custid) {
		this.customerID = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustmailid() {
		return custmailid;
	}
	public void setCustmailid(String custmailid) {
		this.custmailid = custmailid;
	}
	public long getPhonenumb() {
		return phonenumb;
	}
	public void setPhonenumb(long phonenumb) {
		this.phonenumb = phonenumb;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getCustpwsd() {
		return custpwsd;
	}
	public void setCustpwsd(String custpwsd) {
		this.custpwsd = custpwsd;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", custname=" + custname + ", custmailid=" + custmailid + ", phonenumb="
				+ phonenumb + ", aadhar=" + aadhar + ", custpwsd=" + custpwsd +  "]";
	}
		
}
