package Java_11_29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CFile2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("************文件管理系统**********");
		System.out.println("************1、显示D盘所有文件名称**********");
		System.out.println("************2、在D盘创建文件夹test**********");
		System.out.println("************3、在test目录下创建file.txt**********");
		System.out.println("************4、将输入的数据存入file.txt**********");
		System.out.println("************5、拷贝文件到C盘**********");
		System.out.println("************6、退出");
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		System.out.println("输入盘号：");
		String nfilepath=reader.next();
		String strFilePath=nfilepath+":";
		while (true) {
			
		
		System.out.println("输入数字：");
		int num=reader.nextInt();
		
		switch (num) {
		case 1:                                           //显示D盘所有文件
			File file1=new File(strFilePath);
			String[] files=file1.list();
			for (String string : files) {
				System.out.println(string);
			}
			break;
		case 2:											//在D盘创建test目录
			strFilePath+=File.separator+"test";
			File file2=new  File(strFilePath);
			if (!file2.exists()) {
				file2.mkdir();
			} else {
				System.out.println(strFilePath+"盘目录test存在！");
			}
			break;
		case 3:									//在test目录创建file.txt文件
			strFilePath+=File.separator+"file.txt";
			File file3=new File(strFilePath);
				if (!file3.exists()) {
					try {
						file3.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("file.txt文件存在");
				}
			break;
		case 4:										//存入数据
			OutputStream output;
			try {
				output = new FileOutputStream(strFilePath,true);
					output.write("中国".getBytes());
					output.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (IOException e ) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 5:						//拷贝文件
			System.out.println("输入拷贝目的盘：");
			String filepathname=reader.next();
			String strFilePathName=filepathname+":"+File.separator+"test";
			File file4=new File(strFilePathName);
			if (!file4.exists()) {
				file4.mkdir();
					File file5=new File(strFilePathName,"file.txt");
					if (!file5.exists()) {
						try {
							InputStream input=new FileInputStream(strFilePath);
							OutputStream out=new FileOutputStream(file5);
							int i;
								i = input.available();
								byte buffer[]=new byte[i];
								input.read(buffer);
								out.write(buffer);
								out.close();
								input.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								}
					} else {
						System.out.println("E盘file文件存在");
					}
			}else{
				System.out.println("E盘test文件存在");
			}
			break;
			case 6:
				System.exit(0);
				break;
			}
		}
	}
}
/*
 * 实现封装
 * 
 * inputstream input=new inputstream；
 * 循环读取数据
 * int temp=0；
 * int i=0;
 * byte[] buffer=new byte[100];
 * while((temp=input.read)!=-1){
 *		buffer[i]=(byte) temp;
 *		i++;
 * }
 * input.close();
 * 
*/
