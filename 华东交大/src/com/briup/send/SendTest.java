package com.briup.send;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.List;

import com.briup.bean.BIDR;
import com.briup.gather.Gather;

public class SendTest {
	public static void main(String[] args) {
		PipedInputStream pis = new PipedInputStream();
		try {
			PipedOutputStream pos = new PipedOutputStream(pis);
			new Sender(pos, "发送方").start();
			new Fecher(pis, "接受方").start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Sender extends Thread {
	PipedOutputStream pos = null;

	public Sender(PipedOutputStream pos, String name) {
		this.pos = pos;
		setName(name);
	}

	@Override
	public void run() {
		List<BIDR> list = (List<BIDR>) new Gather().gather();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(pos);
			oos.writeObject(list);
			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Fecher extends Thread {
	PipedInputStream pis = null;

	public Fecher(PipedInputStream pis, String name) {
		this.pis = pis;
		setName(name);
	}

	@Override
	public void run() {
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(pis);
			List<BIDR> list = (List<BIDR>) ois.readObject();
			System.out.println("开始接收");
			for (BIDR bidr : list) {
				System.out.println(bidr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
