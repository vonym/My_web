package com.briup.day14.serializable;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private String gender;

	public Student() {
		System.out.println("无参构造器");
	}

	public Student(long id, String name, String gender) {
		System.out.println("有参构造器");
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student :" + id + ", " + name + ", " + gender;
	}
}
