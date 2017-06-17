package com.briup.day15.servertest;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * 构建线程类，此线程类用来处理客户端发送过来的请求
 */
public class HandlerRequest extends Thread {
	private Socket socket;

	public HandlerRequest(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		// 1.获取输入流，赢啦读取客户端浏览器发送的请求
		BufferedReader br = null;
		BufferedOutputStream bos = null;
		try {
			br = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			bos = new BufferedOutputStream(socket.getOutputStream());
			// 2.获取请求行，而已获取客户端发送请求方式，请求的资源路径，使用的协议GET /test.html HTTP/1.1
			String reqLine = br.readLine();
			System.out.println(reqLine);
			// 按照空格作为分隔符
			String[] lines = reqLine.split(" ");
			String pathInfo = lines[1];
			File file = new File("webapps" + pathInfo);
			if (file.exists()) {
				System.out.println("文件找见了");
				// 响应头
				bos.write("HTTP/1.1 200 OK\r\n ".getBytes());
				// 空行
				bos.write("\r\n".getBytes());
				// 相应体
				byte[] b=new byte[8192];
				FileInputStream fis=new FileInputStream(file);
				int count=-1;
				while((count =fis.read(b))!=-1){
					bos.write(b,0,count);
				}
				fis.close();
			} else {
				System.out.println("文件找不见.....");
				bos.write("HTTP/1.1 404 NotFound \r\n".getBytes());
				bos.write("\r\n".getBytes());
				bos.write("Not Found".getBytes());
			}
			bos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (bos != null) {
					bos.close();
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
