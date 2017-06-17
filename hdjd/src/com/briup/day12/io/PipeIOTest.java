package com.briup.day12.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Print extends Thread {
	private PipedInputStream pis;

	public Print(PipedInputStream pis) {
		this.pis = pis;
	}

	public void run() {
		try {
			int val = pis.read();
			System.out.println("1--100之间所有数和：" + val);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Calculate extends Thread {
	private PipedOutputStream pos;

	public Calculate(PipedOutputStream pos) {
		this.pos = pos;
	}

	public void run() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		try {
			pos.write(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class PipeIOTest {
	public static void main(String[] args) {
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos;
		Print p = null;
		Calculate cal = null;
		try {
			pos = new PipedOutputStream(pis);
			p = new Print(pis);
			cal = new Calculate(pos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		p.start();
		cal.start();
	}
}
