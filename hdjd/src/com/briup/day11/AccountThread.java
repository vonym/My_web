package com.briup.day11;

class DepositThrea extends Thread {
	private Account account;

	public DepositThrea(String name, Account account) {
		super(name);
		this.account = account;
	}

	public void run() {
		double atm = account.deposit(1000D);
		System.out.println(getName() + "����" + atm + "Ԫ��");
	}
}

class WithdrawThread extends Thread {
	private Account account;

	public WithdrawThread(String name, Account account) {
		super(name);
		this.account = account;
	}

	public void run() {
		double atm = account.withdraw(1000D);
		System.out.println(getName() + "ȡ��" + atm + "Ԫ��");
	}
}

public class AccountThread {
	public static void main(String[] args) {
		Account account = new Account(1L, 1000D);
		System.out.println("��ǰ�˻���" + account.getId() + "���Ϊ��"
				+ account.getBalance());
		// WithdrawThread mom = new WithdrawThread("mom", account);
		// WithdrawThread son = new WithdrawThread("son", account);
		// mom.start();
		// son.start();
		// try {
		// mom.join();
		// son.join();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }

		DepositThrea mom = new DepositThrea("mom", account);
		DepositThrea son = new DepositThrea("son", account);
		mom.start();
		son.start();
		try {
			mom.join();
			son.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��ǰ�˻���" + account.getId() + "���Ϊ��"
				+ account.getBalance());

	}
}
