package com.briup.socket;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class ServerTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		try {
			ServerSocket serverSocket = new ServerSocket(10000);
			Socket socket = serverSocket.accept();
			InputStream inputStream = socket.getInputStream();
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			List list = (List) objectInputStream.readObject();
			for (Object object : list) {
				System.out.println(object);
			}
			serverSocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
