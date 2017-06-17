package com.briup.day12;

class ResultSet {
	private int value;
	private boolean flag = false;// 有没有线程等待

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
		// 通知等待线程，开始运行
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
		// 等待
		try {
			synchronized (result) {
				result.setFlag(true);
				result.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1-100的和：" + result.getValue());
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
