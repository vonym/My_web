package com.briup.day12.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamTest {
	public static void input() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(
				"src/com/briup/day12/io/out.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		try {
			// int i = -1;
			// while ((i = fis.read()) != -1) {
			// System.out.println(i);
			// }
			byte[] b = new byte[30];
			// int count = fis.read(b);
			int count = bis.read(b);
			System.out.println(new String(b, 0, count));
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
			}
		}
	}

	// public static void output() throws FileNotFoundException {
	// FileOutputStream fos = new FileOutputStream("out.txt");
	// // fos.write(new byte[]{10,2,3,4,45,5});
	// try {
	// fos.write("今天天气真好！".getBytes());
	// fos.flush();
	// } catch (IOException e) {
	// throw new RuntimeException(e);
	// } finally {
	// try {
	// fos.close();
	// } catch (Exception e) {
	//
	// }
	// }
	// }
	public static void output() {
		BufferedOutputStream bos = null;
		FileOutputStream fos = null;
		// fos.write(new byte[]{10,2,3,4,45,5});
		try {
			fos = new FileOutputStream("src/com/briup/day12/io/out.txt");
			bos = new BufferedOutputStream(fos);
			// fos.write("今天天气真好！".getBytes());
			// fos.flush();
			bos.write("".getBytes());
			bos.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (Exception e) {

			}
		}
	}

	public static void main(String[] args) {
		// try {
		// output();
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }
		output();
		try {
			input();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
