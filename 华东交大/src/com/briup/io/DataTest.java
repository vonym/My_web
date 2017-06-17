package com.briup.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataTest {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/com/briup/io/test.txt");
			// FileOutputStream fos = new
			// FileOutputStream("src/com/briup/io/test.txt",true);//第二个参数Boolean值表示是否追加
			// FileOutputStream fos = new
			// FileOutputStream("src/com/briup/io/test.txt");
			// print(fos);
			get(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void get(InputStream is) throws Exception {
		// DataInputStream必须怎么写怎么读，按照顺序来
		DataInputStream dis = new DataInputStream(is);
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
	}

	public static void print(OutputStream os) {
		try {
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeBoolean(true);
			dos.writeChar('a');
			dos.writeInt(10);
			dos.writeDouble(Math.random());
			dos.writeUTF("HelloWorld");
			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
