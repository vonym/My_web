package com.briup.day12;

class ResultSet {
	private int value;
	private boolean flag = false;// ��û���̵߳ȴ�

	public void setValue(int value) {
		while (!flag) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		synchronized (this) {
			this.notifyAll();
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isFlag() {
		try {
			synchronized (this) {
				flag = true;
				this.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}

class CalculateThreade extends Thread {
	private ResultSet result;

	public CalculateThreade(ResultSet result) {
		this.result = result;
	}

	public void run() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		result.setValue(sum);
		while (!result.isFlag()) {
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// ֪ͨ�ȴ��̣߳���ʼ����
		synchronized (result) {
			result.notifyAll();
		}
	}
}

class PrintThreade extends Thread {
	private ResultSet result;

	public PrintThreade(ResultSet result) {
		this.result = result;
	}

	public void run() {
		// �ȴ�
		try {
			synchronized (result) {
				result.setFlag(true);
				result.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1-100�ĺͣ�" + result.getValue());
	}
}

public class WaitThread {
	public static void main(String[] args) {
		ResultSet result = new ResultSet();
		CalculateThreade calculateThreade = new CalculateThreade(result);
		PrintThreade printThreade = new PrintThreade(result);
		calculateThreade.start();
		printThreade.start();
	}
}
