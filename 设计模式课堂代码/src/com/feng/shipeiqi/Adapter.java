package com.feng.shipeiqi;

public class Adapter extends Target {
	private Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		adaptee.specificRequest();
	}
}
