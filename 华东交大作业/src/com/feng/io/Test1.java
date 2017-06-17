package com.feng.io;

public class Test1 extends Parent {
	public static void foo() {
	}

	public static void main(String[] args) {
		Test1 test1=new Test1();
		if (test1 instanceof Parent) {
			System.out.println(true);
		}
	}
}
