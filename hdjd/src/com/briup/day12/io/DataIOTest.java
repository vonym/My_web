package com.briup.day12.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOTest {
	public static void DataOut() {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(
					"src/com/briup/day12/io/data.txt"));
			dos.writeInt(100);
			dos.writeBoolean(false);
			dos.writeUTF("今天风好大。。。。");
			//dos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void DataInput() {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream(
					"src/com/briup/day12/io/data.txt"));
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readUTF());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		DataOut();
		DataInput();
	}
}
