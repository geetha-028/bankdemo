package com.example.bankdemo.entity;


public class Customer {

	private String name;
	private String mobileNumber;
	private String emailId;
	private String address;
	private String aadherNumber;
	
	public Customer() {
		super();
	}
	public Customer(String name, String mobileNumber, String emailId, String address, String aadherNumber) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.address = address;
		this.aadherNumber = aadherNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAadherNumber() {
		return aadherNumber;
	}
	public void setAadherNumber(String aadherNumber) {
		this.aadherNumber = aadherNumber;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", address="
				+ address + ", aadherNumber=" + aadherNumber + "]";
	}
	
	
}
