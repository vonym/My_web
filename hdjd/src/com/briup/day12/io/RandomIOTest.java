package com.briup.day12.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomIOTest {
	public static void main(String[] args) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("src/com/briup/day12/io/random.txt",
					"rw");
			// raf.getFilePointer();//返回当前文件的写读位置
			// raf.setLength(10);//设置文件的长度
			raf.write("hello world! ".getBytes());
			//raf.seek(3);//将写读指针设置为3,效率比skip()方法高
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (raf != null) {
				try {
					raf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
