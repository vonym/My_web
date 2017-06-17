package com.briup.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ReaderTest {
	public static void main(String[] args) {
		try {
			// FileInputStream fis = new
			// FileInputStream("src/com/briup/io/test.txt");
			// FileOutputStream fos = new
			// FileOutputStream("src/com/briup/io/test.txt");
			// OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			FileReader fr = new FileReader("src/com/briup/io/test.txt");
			FileWriter fw = new FileWriter("src/com/briup/io/test3.txt");

			BufferedWriter bw = new BufferedWriter(fw);
			// InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			BufferedReader br = new BufferedReader(fr);
			// System.out.println(br.readLine());
			String str = null;
			int data = 0;
			while ((str = br.readLine()) != null) {
				// System.out.println(str);
				bw.write(str + "\r");
			}
			// while ((data = br.read()) != -1) {
			// System.out.println(br.readLine());
			// }
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
