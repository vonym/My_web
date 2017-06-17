package com.briup.day14.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOTest {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		ObjectInputStream ois = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(
					"src/com/briup/day14/serializable/obj"));
			ois = new ObjectInputStream(new FileInputStream(
					"src/com/briup/day14/serializable/obj"));
			Student stu = new Student(1L, "tom", "male");
			out.writeObject(stu);
			out.flush();
			Object o = ois.readObject();
			System.out.println(o==stu);
			if (o instanceof Student) {
				Student student = (Student) o;
				System.out.println(student);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
