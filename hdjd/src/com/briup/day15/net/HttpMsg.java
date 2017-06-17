package com.briup.day15.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpMsg {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9999);
		Socket socket = server.accept();
		System.out.println(socket);
		BufferedReader br = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		String msg = null;
		int length = -1;
		while ((msg = br.readLine()) != null && !"".equals(msg)) {
			System.out.println(msg);
			if (msg.toUpperCase().startsWith("CONTENT-LENGTH")) {
				length = Integer.parseInt(msg.split(":")[1].trim());
			}
		}
		char[] c = new char[length];
		int count = br.read(c, 0, length);
		System.out.println(new String(c, 0, count));
		br.close();
		server.close();
	}
}
