package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {
	
	@SequenceGenerator(
			name = "customerId_seq",
			sequenceName = "customerId_seq",
			allocationSize = 1
			
			)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "customerId_seq"
			)
	private long customerID;
	private String customerFirst;
	private String customerLast;
	private String customerEmail;
	private long customerNo;
	public long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	public String getCustomerFirst() {
		return customerFirst;
	}
	public void setCustomerFirst(String customerFirst) {
		this.customerFirst = customerFirst;
	}
	public String getCustomerLast() {
		return customerLast;
	}
	public void setCustomerLast(String customerLast) {
		this.customerLast = customerLast;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public long getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(long customerNo) {
		this.customerNo = customerNo;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerFirst=" + customerFirst + ", customerLast="
				+ customerLast + ", customerEmail=" + customerEmail + ", customerNo=" + customerNo + "]";
	}
	public Customer(long customerID, String customerFirst, String customerLast, String customerEmail, long customerNo) {
		super();
		this.customerID = customerID;
		this.customerFirst = customerFirst;
		this.customerLast = customerLast;
		this.customerEmail = customerEmail;
		this.customerNo = customerNo;
	}
	public Customer() {
		super();
	}
	
	
	
}
