package com.briup.day10;

public class InterruptTest extends Thread {
	@Override
	public void run() {
		try {
//			System.out.println("1是否被中断：" + isInterrupted());
//			System.out.println("2是否被中断：" + isInterrupted());
			System.out.println("1是否被中断：" + interrupted());
			System.out.println("2是否被中断：" + interrupted());
			Thread.sleep(1000);
			System.out.println("线程睡到自然醒。。");
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("线程被中断，当前状态为：" + isInterrupted());
		}
	}

	public static void main(String[] args) {
		InterruptTest it = new InterruptTest();
		it.start();
		it.interrupt();
	}
}
