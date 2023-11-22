package com.example.bankdemo.entity;

public class Student {

	private int id;
	private String name;
	private String mobile;
	private double fee;
	private char gender; // M, F, O
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String mobile, double fee, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.fee = fee;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", fee=" + fee + ", gender=" + gender
				+ "]";
	}
	
	
}
