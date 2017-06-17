package com.briup.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomTest {
	public static void main(String[] args) {
		File file = new File("src/com/briup/io/test.txt");
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			raf.writeBoolean(true);// 占一个字节
			raf.writeInt(10);// 占四个字节
			raf.writeDouble(Math.random());// 占8个字节
			raf.writeUTF("helloworld");
			raf.writeChar('a');
			raf.seek(0);
			System.out.println(raf.readBoolean());
			raf.skipBytes(12);// 跳过多少个字节
			raf.skipBytes(raf.readShort());
			// System.out.println(raf.readInt());
			// System.out.println(raf.readDouble());
			System.out.println(raf.readChar());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
