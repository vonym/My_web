package com.briup.day11;

class DepositThrea extends Thread {
	private Account account;

	public DepositThrea(String name, Account account) {
		super(name);
		this.account = account;
	}

	public void run() {
		double atm = account.deposit(1000D);
		System.out.println(getName() + "存了" + atm + "元！");
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
		System.out.println(getName() + "取了" + atm + "元。");
	}
}

public class AccountThread {
	public static void main(String[] args) {
		Account account = new Account(1L, 1000D);
		System.out.println("当前账户：" + account.getId() + "余额为："
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
		System.out.println("当前账户：" + account.getId() + "余额为："
				+ account.getBalance());

	}
}
