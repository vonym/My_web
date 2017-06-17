package com.briup.param;

public class User {
	private String name;
	private String password;
	private String gender;
	private int age;
	private String hobby;

	public User() {
	}

	public User(String name, String password, String gender, int age, String hobby) {
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.hobby = hobby;
	}

	public User(String name, String password, String gender, String hobby) {
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", gender=" + gender + ", age=" + age + ", hobby="
				+ hobby + "]";
	}
}
