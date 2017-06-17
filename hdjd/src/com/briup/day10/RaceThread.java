package com.briup.day10;

public class RaceThread extends Thread {
	static boolean flag = false;

	public RaceThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (flag) {
				break;
			}
			System.out.println(getName() + " 跑了 " + i + " 米！");
		}
		flag = true;
	}

	public static void main(String[] args) {
		RaceThread rt = new RaceThread("乌龟");
		RaceThread rt2 = new RaceThread("兔子");
		System.out.println(Thread.currentThread().getName() + "比赛开始了。。。");
		rt.start();
		rt2.start();
		try {
			// Thread.sleep(1000);
			rt.join();
			rt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "比赛结束。。。");
	}
}
