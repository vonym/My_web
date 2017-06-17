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
			// raf.getFilePointer();//���ص�ǰ�ļ���д��λ��
			// raf.setLength(10);//�����ļ��ĳ���
			raf.write("hello world! ".getBytes());
			//raf.seek(3);//��д��ָ������Ϊ3,Ч�ʱ�skip()������
			
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
