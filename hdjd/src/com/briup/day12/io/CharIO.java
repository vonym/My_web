package com.briup.day12.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharIO {
	public static void charInput() {
		FileReader fr = null;
		try {
			fr = new FileReader("src/com/briup/day12/io/data.txt");
			char[] c = new char[100];
			fr.read(c);
			System.out.println(new String(c));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void charOut() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/com/briup/day12/io/data.txt");
			fw.write("我是通过FileWriter写入的数据。。。。哈哈哈哈哈哈哈哈啊哈哈\n");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		charOut();
		charInput();

	}
}
