package com.feng.guanchazhe;

public class Person implements IObserver {
	private String name;
	private String observerAction;

	public Person(String name, String observerAction) {
		this.name = name;
		this.observerAction = observerAction;
	}

	@Override
	public void display() {
		System.out.println(getName() + "结束" + getObserverAction() + "	换成做样子");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObserverAction() {
		return observerAction;
	}

	public void setObserverAction(String observerAction) {
		this.observerAction = observerAction;
	}
}