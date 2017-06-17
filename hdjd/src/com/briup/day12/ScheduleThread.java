package com.briup.day12;

class YieldThread extends Thread {
	public void run() {
		for (int i = 1; i <= 6; i++) {
			if (i == 2 || i == 4) {
				System.out.println(getName() + "准备让步.......");
				yield();
				System.out.println(getName() + "让步成功.......");
			}
			System.out.println(getName() + ".............." + i);
		}
	};
}

public class ScheduleThread {
	public static void main(String[] args) {
		YieldThread yt1 = new YieldThread();
		yt1.setPriority(Thread.MAX_PRIORITY);
		YieldThread yt2 = new YieldThread();
		YieldThread yt3 = new YieldThread();
		yt3.setPriority(Thread.MIN_PRIORITY);
		yt1.start();
		yt2.start();
		yt3.start();
	}
}
