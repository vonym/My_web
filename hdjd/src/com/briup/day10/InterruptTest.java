package com.briup.day10;

public class InterruptTest extends Thread {
	@Override
	public void run() {
		try {
//			System.out.println("1�Ƿ��жϣ�" + isInterrupted());
//			System.out.println("2�Ƿ��жϣ�" + isInterrupted());
			System.out.println("1�Ƿ��жϣ�" + interrupted());
			System.out.println("2�Ƿ��жϣ�" + interrupted());
			Thread.sleep(1000);
			System.out.println("�߳�˯����Ȼ�ѡ���");
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("�̱߳��жϣ���ǰ״̬Ϊ��" + isInterrupted());
		}
	}

	public static void main(String[] args) {
		InterruptTest it = new InterruptTest();
		it.start();
		it.interrupt();
	}
}
