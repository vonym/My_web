package com.briup.day11;

public class Account {
	private Long id;
	private double balance;

	public Account(Long id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	// »°«Æ
	public double withdraw(double atm) {
		if (atm < 0) {
			return 0;
		}
		synchronized (this) {
			double temp = this.balance;
			if (atm > temp) {
				return 0;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			temp -= atm;
			this.balance = temp;
		}
		return atm;
	}

	// ¥Ê«Æ
	public double deposit(double atm) {
		if (atm < 0) {
			return 0;
		}
		synchronized (this) {
			double temp = this.balance;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			temp += atm;
			this.balance = temp;
		}
		return atm;
	}
}