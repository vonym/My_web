package com.briup.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintTest {
	public static void main(String[] args) {
		File file = new File("src/com/briup/io/test.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			PrintWriter out = new PrintWriter(fos, true);
			out.print(true);
			out.print(Math.random());
			int num = Integer.parseInt("abc");
			out.println(10);
			out.println("hello world");
			// out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
