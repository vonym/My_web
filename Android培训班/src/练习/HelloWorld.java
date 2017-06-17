package Á·Ï°;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strFilePathName="E:\\";
		File file1 =new File(strFilePathName,"1.txt");
		File file2 =new File(strFilePathName,"2.txt");
		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("file1´æÔÚ");
		}
		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("file2´æÔÚ");
		}
		try {
			OutputStream out=new FileOutputStream(file2);
			InputStream in=new FileInputStream(file1);
			byte[] b=new byte[20];
			try {
				in.read(b);
				System.out.println(new String(b));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				out.write(b);
				out .close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//file1.delete();
		if (!file1.exists()) {
			System.out.println("ÒÑÉ¾³ý");
		} else {
			System.out.println("É¾³ýÊ§°Ü");
		}
	}
}
