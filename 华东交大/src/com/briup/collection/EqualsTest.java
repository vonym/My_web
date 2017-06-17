package com.briup.collection;

public class EqualsTest {
	public static void main(String[] args) {
		/*
		 * 错误原因：EqualsTest et在栈操作 new EqualsTest在堆操作
		 *  if (true) EqualsTest et=new
		 * EqualsTest();
		 */
		int a = 10;
		int b = 10;
		System.out.println(a == b);
		String string1 = "china";
		String string2 = "china";
		System.out.println(string1 == string2);
		String s1 = new String("china");
		String s2 = new String("china");
		System.out.println(s1 == s2);
	}
}