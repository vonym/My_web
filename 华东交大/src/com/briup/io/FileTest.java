package com.briup.io;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\vonym\\Documents\\javaCore\\workspace\\华东交大\\src\\com\\briup\\io\\test.txt");
		File file2 = new File("src/com/briup/io/test.txt");
		File file3 = new File("src/com/briup/test");
		File file4 = new File("./test");
		try {
			System.out.println(file4.getCanonicalPath());// 会自动去除"./"
			System.out.println(file4.getAbsolutePath());// 会自动加"./"
			System.out.println(file4.getParent());
			System.out.println(file4.getPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
		// file2.renameTo(file3);
		// System.out.println(file.getAbsolutePath());
		// System.out.println(file2.getAbsolutePath());
		// System.out.println(file.getParent());
		// System.out.println(file2.getParent());
		// System.out.println(file.getPath());
		// System.out.println(file2.getPath());

		// File file4 = new File("src/com/briup/io");
		// String[] name = file4.list();
		// for (String s : name) {
		// // System.out.println(s);
		// new File(file3,s).delete();
		// try {
		// new File(file3, s).createNewFile();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// }

		// file3.delete();
		// if (!file3.exists()) {
		// file3.mkdir();
		// }
		// System.out.println(file3.isDirectory());

		// System.out.println(file.exists() + " read:" + file.canRead() + "
		// write:" + file.canWrite() + " excute:"
		// + file.canExecute());
		// if (file2.exists()) {
		// try {
		// file2.createNewFile();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// }

	}
}
