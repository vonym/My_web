package com.briup.pojo;

import java.util.Date;

public class Student {
	private Integer studId;
	private String name;
	private String email;
	private Date dob;
	private PhoneNumber phoneNumber;
	private Address address;

	public Student(Integer studId, String name, String email, Date dob, PhoneNumber phoneNumber, Address address) {
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public Student(Integer studId, String name, String email, Date dob) {
		super();
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

	public Student(Integer studId, String name, String email, Date dob, PhoneNumber phoneNumber) {
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
	}

	public Student(Integer studId, String name, String email) {
		this.studId = studId;
		this.name = name;
		this.email = email;
	}

	public Student() {
	}

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", email=" + email + ", dob=" + dob + ", phoneNumber="
				+ phoneNumber + ", address=" + address + "]";
	}
}
