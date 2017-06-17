package com.feng.annotation;

//@Description("I am class Child")
public class Child extends Person {
	@Override
	//@Description("I am method Child")
	public void sing() {
		System.out.println("Child sing");
	}
}
