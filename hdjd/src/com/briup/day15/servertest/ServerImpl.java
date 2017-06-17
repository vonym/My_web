package com.briup.day15.servertest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerImpl implements Server {
	private ServerSocket server;

	@Override
	public void start() {
		try {
			server = new ServerSocket(6666);
			while (true) {
				Socket socket = server.accept();
				new HandlerRequest(socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (server != null) {
					server.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ServerImpl().start();
	}
}
