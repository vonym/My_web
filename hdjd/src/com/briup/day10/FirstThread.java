package com.briup.day10;

//�����̣߳�ִ�д�ӡ����1-100֮���������͵Ĺ���
public class FirstThread extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(getName() + "+" + i + "֮��Ľ��:" + sum);
		}
	}

	public static void main(String[] args) {
		FirstThread ft1 = new FirstThread();
		FirstThread ft2 = new FirstThread();
		FirstThread ft3 = new FirstThread();
		ft1.start();
		ft2.start();
		ft3.start();
	}
}
