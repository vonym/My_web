package com.briup.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectTest {
	public static void main(String[] args) {
		write("src/com/briup/io/test.txt");
		read("src/com/briup/io/test.txt");
	}

	public static void write(String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Student student = new Student("tom", 20);
			oos.writeObject(student);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void read(String path) {
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student student = (Student) ois.readObject();
			System.out.println(student.getName());
			System.out.println(student.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Student implements Serializable {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		super();
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
}
