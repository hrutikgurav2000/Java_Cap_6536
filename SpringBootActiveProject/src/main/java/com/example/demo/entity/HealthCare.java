package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class HealthCare {
	@SequenceGenerator(
			name = "policyId_seq",
			sequenceName = "policyId_seq",
			allocationSize = 1
			
			)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "policyId_seq"
			)
	private long policyID;
	private String policyName;
	private int policyTenture;
	private String policyType;
	
	public long getPolicyID() {
		return policyID;
	}
	public void setPolicyID(long policyID) {
		this.policyID = policyID;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getPolicyTenture() {
		return policyTenture;
	}
	public void setPolicyTenture(int policyTenture) {
		this.policyTenture = policyTenture;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public HealthCare() {
		super();
	}
	public HealthCare(long policyID, String policyName, int policyTenture, String policyType) {
		super();
		this.policyID = policyID;
		this.policyName = policyName;
		this.policyTenture = policyTenture;
		this.policyType = policyType;
	}
	@Override
	public String toString() {
		return "HealthCare [policyID=" + policyID + ", policyName=" + policyName + ", policyTenture=" + policyTenture
				+ ", policyType=" + policyType + "]";
	}
	
	

}
