package com.briup.day10;

public class FirstRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out
					.println(Thread.currentThread().getName() + " Ŀǰλ�ã� " + i);
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new FirstRunnable(), "t1");
		Thread t2 = new Thread(new FirstRunnable(), "t2");
		Thread t3 = new Thread(new FirstRunnable(), "t3");
		t1.start();
		t2.start();
		t3.start();
	}
}
