package com.briup.socket;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ClientTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 10000);
			OutputStream outputStream = socket.getOutputStream();
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			List list = new ArrayList<>();
			objectOutputStream.writeObject(list);
			objectOutputStream.flush();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
