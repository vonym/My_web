package com.briup.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Student student1 = new Student("tom", 20);
		Student student2 = new Student("tom", 20);
		Set<Student> set = new HashSet<>();
		set.add(student1);
		set.add(student2);
		System.out.println(student1.equals(student2));
		for (Student student : set) {
			System.out.println(student);
		}
	}
}

class Student {
	private String name;
	private int age;

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

	public Student() {
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return this.name.equals(student.name) && (this.age == student.age);
	}

	/*
	 * public boolean equals(Object obj) { return this == obj; }
	 */

	/*
	 * public boolean equals(Student student) { return
	 * this.name.equals(student.name) && (this.age == student.age); }
	 */

	public int hashCode() {
		return name.hashCode() + age;
	}
}
