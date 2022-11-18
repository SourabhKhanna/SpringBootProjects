package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	 @Id
	 private int custId;
	 
	 private String custName;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String toString()
	{
		return custId + " " +custName;
	}
	 
}
