package com.briup.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class SetTest2 {
	public static void main(String[] args) {
		Teacher t = new Teacher("tom", 20);
		Teacher t2 = new Teacher("jack", 21);
		Teacher t3 = new Teacher("rose", 22);
		TeacherComparator teacherComparator = new TeacherComparator();
		TreeSet<Teacher> set = new TreeSet<Teacher>(teacherComparator);
		// TreeSet<Teacher> set = new TreeSet<Teacher>();
		set.add(t);
		set.add(t2);
		set.add(t3);
		for (Teacher teacher : set) {
			System.out.println(teacher);
		}
	}
}

/*
 * class Teacher implements Comparable { private String name; private int age;
 * 
 * public Teacher(String name, int age) { super(); this.name = name; this.age =
 * age; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public int getAge() { return age; }
 * 
 * public void setAge(int age) { this.age = age; }
 * 
 * public Teacher() { }
 * 
 * @Override public String toString() { return "Teacher [name=" + name +
 * ", age=" + age + "]"; }
 * 
 * @Override public int compareTo(Object o) { Teacher teacher = (Teacher) o;
 * return this.name.compareTo(teacher.name); } }
 */
class TeacherComparator implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		Teacher t1 = (Teacher) obj1;
		Teacher t2 = (Teacher) obj2;
		// ÉýÐò
		/*
		 * if (t1.getAge() > t2.getAge()) return 1; else if (t1.getAge() <
		 * t2.getAge()) return -1; else return 0;
		 */
		if (t1.getName().compareTo(t2.getName()) > 0)
			return 1;
		if (t1.getName().compareTo(t2.getName()) < 0)
			return -1;
		else
			return 0;
	}
}

class Teacher {
	private String name;
	private int age;

	public Teacher(String name, int age) {
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

	public Teacher() {
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
}