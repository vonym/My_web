package com.briup.day9;

public class Person {
	private String name;
	public int age;

	public Person() {
		System.out.println("Person....�޲ι�����");
	}

	public Person(String name, int age) {
		System.out.println("Person ....��������������");
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
