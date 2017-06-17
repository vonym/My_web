package com.feng.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void main(String[] args) {
		try {
			ServerSocket server = null;
			server = new ServerSocket(8888);
			Socket socket = null;
			socket = server.accept();
			String line;
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter os = new PrintWriter(socket.getOutputStream());
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client:" + is.readLine());
			line = sin.readLine();
			while (!line.equals("bye")) {
				os.println(line);
				os.flush();
				System.out.println("Server:" + line);
				System.out.println("Client:" + is.readLine());
				line = sin.readLine();
			}
			os.close();
			is.close();
			socket.close();
			server.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}