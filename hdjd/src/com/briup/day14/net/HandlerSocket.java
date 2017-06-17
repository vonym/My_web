package com.briup.day14.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class HandlerSocket extends Thread {
	private Socket socket;

	public HandlerSocket(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		PrintWriter pw = null;
		Scanner sc = null;
		Scanner sc2 = null;
		try {
			pw = new PrintWriter(socket.getOutputStream());
			pw.println("客服" + getName() + "为您服务！");
			pw.flush();
			sc = new Scanner(System.in);
			sc2 = new Scanner(socket.getInputStream());
			while (true) {
				String msg = sc2.nextLine();
				System.out.println("client say:" + msg);
				if ("bye".equals(msg)) {
					break;
				}
				pw.println(sc.nextLine());
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null) {
					pw.close();
				}
				if (sc != null) {
					sc.close();
				}
				if (sc2 != null) {
					sc2.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
