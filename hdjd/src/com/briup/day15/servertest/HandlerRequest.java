package com.briup.day15.servertest;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * �����߳��࣬���߳�����������ͻ��˷��͹���������
 */
public class HandlerRequest extends Thread {
	private Socket socket;

	public HandlerRequest(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		// 1.��ȡ��������Ӯ����ȡ�ͻ�����������͵�����
		BufferedReader br = null;
		BufferedOutputStream bos = null;
		try {
			br = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			bos = new BufferedOutputStream(socket.getOutputStream());
			// 2.��ȡ�����У����ѻ�ȡ�ͻ��˷�������ʽ���������Դ·����ʹ�õ�Э��GET /test.html HTTP/1.1
			String reqLine = br.readLine();
			System.out.println(reqLine);
			// ���տո���Ϊ�ָ���
			String[] lines = reqLine.split(" ");
			String pathInfo = lines[1];
			File file = new File("webapps" + pathInfo);
			if (file.exists()) {
				System.out.println("�ļ��Ҽ���");
				// ��Ӧͷ
				bos.write("HTTP/1.1 200 OK\r\n ".getBytes());
				// ����
				bos.write("\r\n".getBytes());
				// ��Ӧ��
				byte[] b=new byte[8192];
				FileInputStream fis=new FileInputStream(file);
				int count=-1;
				while((count =fis.read(b))!=-1){
					bos.write(b,0,count);
				}
				fis.close();
			} else {
				System.out.println("�ļ��Ҳ���.....");
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
