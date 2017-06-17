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
			raf.writeBoolean(true);// ռһ���ֽ�
			raf.writeInt(10);// ռ�ĸ��ֽ�
			raf.writeDouble(Math.random());// ռ8���ֽ�
			raf.writeUTF("helloworld");
			raf.writeChar('a');
			raf.seek(0);
			System.out.println(raf.readBoolean());
			raf.skipBytes(12);// �������ٸ��ֽ�
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
