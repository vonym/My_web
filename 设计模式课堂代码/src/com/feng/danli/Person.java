package com.feng.danli;

public class Person {
	private static Person person = null;

	private Person() {

	}

	public static Person newPerson() {
		if (person == null) {
			person = new Person();
		}
		return person;
	}
}
