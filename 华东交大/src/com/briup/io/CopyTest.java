package com.briup.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("src/com/briup/io/test.txt");
			fos = new FileOutputStream("src/com/briup/io/test1.txt");
			// System.out.println(fis.available());
			// read()返回的int值是阿斯克码值
			// int data = 0;
			// while ((data = fis.read()) != -1) {
			// System.out.println((char) data);
			// }
			// read(byte[])返回的是一次读取的长度
			// byte[] b = new byte[9];
			// int data = 0;
			// System.out.println(fis.read(b));
			// System.out.println(new String(b));
			// System.out.println(fis.read(b));
			// System.out.println(new String(b));
			byte[] b = new byte[10];
			int data = 0;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}