package com.feng.reflect;

import java.lang.reflect.Method;

public class ClassDemo3 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		A a = new A();
		Class c = a.getClass();
		try {
			Method method = c.getMethod("print", int.class, int.class);
			Method method1 = c.getMethod("print", String.class, String.class);
			 method.invoke(a, 1, 2);
			method1.invoke(a, "a", "b");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class A {
	public void print(int a, int b) {
		System.out.println("a+b=" + (a + b));
	}

	public void print(String a, String b) {
		System.out.println("a+b=" + a + b);
	}
}
