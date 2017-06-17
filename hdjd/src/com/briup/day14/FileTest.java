package com.briup.day14;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		// File file = new File("D:\\hdjd_510.txt");
		// System.out.println(file.exists());
		// System.out.println(file.isDirectory());
		// System.out.println(file.isFile());
		// System.out.println(file.isAbsolute());
		// if (!file.exists()) {
		// try {
		// file.createNewFile();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// } else {
		// file.delete();
		// }
		// File f1 = new File("D:\\hdjd");
		// if (!f1.exists()) {
		// f1.mkdir();
		// } else {
		// f1.delete();
		// }
		File f2 = new File("src");
		String[] fs = f2.list();
		for (String f : fs) {
			System.out.println(f);
		}
		File[] fs2 = f2.listFiles();
		 for (File fn : fs2) {
		 System.out.println(fn.getName());
		 }
		listR(f2);

	}

	public static void listR(File f) {
		if (f.isDirectory()) {
			System.out.println("Ä¿Â¼£º" + f.getName());
			File[] fs = f.listFiles();
			for (File fn : fs) {
				listR(fn);
			}
		} else {
			System.out.println("ÎÄ¼þ£º" + f.getName());
		}
	}
}
