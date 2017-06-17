package com.briup.day14.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	static boolean flag = true;

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		// InputStream is = null;
		//BufferedReader br = null;
		try {
			// 1.创建ServerSocket
			server = new ServerSocket(8888);
			while (flag) {
				// System.out.println("即将进入等待状态");
				socket = server.accept();
				//分配一个线程处理客户端的请求
				new HandlerSocket(socket).start();
			}
			// System.out.println("接收到客户端发送的请求....");
			// is = socket.getInputStream();
			// byte[] b = new byte[30];
			// int i = -1;
			// while ((i = is.read(b)) != -1) {
			// System.out.println(new String(b));
			// }
			// br = new BufferedReader(new InputStreamReader(
			// socket.getInputStream()));
			// String msg = br.readLine();
			// System.out.println(msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// if (br != null) {
				// br.close();
				// }
				if (socket != null) {
					socket.close();
				}
				if (server != null) {
					server.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
