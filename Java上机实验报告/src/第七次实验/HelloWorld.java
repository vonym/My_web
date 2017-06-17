package 第七次实验;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("请输入file文件创建的盘号：");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		String strFilePath=scanner.next()+":";
		File file=new File(strFilePath,"file.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("file文件存在！");
		}
		try {
			OutputStream out=new FileOutputStream(file);
			out.write("Helloworld!".getBytes());
			out.close();
			InputStream input=new FileInputStream(file);
			int i=input.available();
			byte[] buffer=new byte[i];
			input.read(buffer);
			System.out.println(new String(buffer));
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
