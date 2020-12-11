package com.xworkz.DTO;

public class CustomerDTO {
	private int customerId;
	private String name;
	private long contactNo;
	private String emailId;
	
	public void CustomerDTO() {
		System.out.println("start");
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public long getContactNo() {
		return contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	

	
}
