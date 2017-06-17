package com.briup.day9;

public class Person {
	private String name;
	public int age;

	public Person() {
		System.out.println("Person....无参构造器");
	}

	public Person(String name, int age) {
		System.out.println("Person ....两个参数构造器");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ", " + age;
	}
}
