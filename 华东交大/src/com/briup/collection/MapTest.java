package com.briup.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		// Map<Student2, Integer> map = new HashMap<>();
		// Map<Student2, Integer> map = new TreeMap<>();
		Student2Comparator comparator = new Student2Comparator();
		Map<Student2, Integer> map = new TreeMap<>(comparator);
		Student2 s1 = new Student2("tom", 20, 90);
		Student2 s2 = new Student2("jack", 21, 91);
		Student2 s3 = new Student2("rose", 22, 94);
		Student2 s4 = new Student2("mark", 20, 98);
		map.put(s1, s1.getScore());
		map.put(s2, s2.getScore());
		map.put(s3, s3.getScore());
		map.put(s4, s4.getScore());
		Set<Student2> set = map.keySet();
		for (Student2 student2 : set) {
			Object value = map.get(student2);
			System.out.println(student2.getName() + "	" + value);
		}

		/*
		 * Set set = map.entrySet(); for (Object object : set) {
		 * System.out.println(object); }
		 */
	}
}

class Student2Comparator implements Comparator {

	@Override
	public int compare(Object object1, Object object2) {
		Student2 student2 = (Student2) object1;
		Student2 studenet21 = (Student2) object2;
		if (student2.getScore() > studenet21.getScore())
			return 1;
		if (student2.getScore() < studenet21.getScore())
			return -1;
		else
			return 0;
	}
}

class Student2 implements Comparable {
	private String name;
	private int age;
	private int score;

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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student2() {
	}

	public Student2(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	/*
	 * public boolean equals(Object object) { Student2 student2 = (Student2)
	 * object; return name.equals(student2.name) && (age == student2.age); }
	 * 
	 * @Override public int hashCode() { return name.hashCode() + age; }
	 */

	@Override
	public int compareTo(Object object) {
		Student2 student2 = (Student2) object;
		// return score-student2.score;//³É¼¨
		return name.compareTo(student2.name);// Ãû×ÖÅÅÐò
	}
}