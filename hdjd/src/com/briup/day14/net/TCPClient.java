package com.briup.day14.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		Socket socket = null;
		// OutputStream os = null;
		// BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;
		Scanner sc2 = null;
		try {
			socket = new Socket("127.0.0.1", 8888);
			// os = socket.getOutputStream();
			// os.write("Can you help me?".getBytes());
			// os.flush();
			// bw = new BufferedWriter(new OutputStreamWriter(
			// socket.getOutputStream()));
			// bw.write("Can you help me?");
			// bw.newLine();
			// bw.flush();
			pw = new PrintWriter(socket.getOutputStream());
			sc = new Scanner(socket.getInputStream());
			sc2 = new Scanner(System.in);
			while (true) {
				String msg = sc.nextLine();
				System.out.println("server say:" + msg);
				if ("bye".equals(msg)) {
					break;
				}
				pw.println(sc2.nextLine());
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (sc != null) {
					sc.close();
				}
				if (pw != null) {
					pw.close();
				}
				if (socket != null) {
					socket.close();
				}
				if (sc2 != null) {
					sc2.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
