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
		System.out.println("************�ļ�����ϵͳ**********");
		System.out.println("************1����ʾD�������ļ�����**********");
		System.out.println("************2����D�̴����ļ���test**********");
		System.out.println("************3����testĿ¼�´���file.txt**********");
		System.out.println("************4������������ݴ���file.txt**********");
		System.out.println("************5�������ļ���C��**********");
		System.out.println("************6���˳�");
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		System.out.println("�����̺ţ�");
		String nfilepath=reader.next();
		String strFilePath=nfilepath+":";
		while (true) {
			
		
		System.out.println("�������֣�");
		int num=reader.nextInt();
		
		switch (num) {
		case 1:                                           //��ʾD�������ļ�
			File file1=new File(strFilePath);
			String[] files=file1.list();
			for (String string : files) {
				System.out.println(string);
			}
			break;
		case 2:											//��D�̴���testĿ¼
			strFilePath+=File.separator+"test";
			File file2=new  File(strFilePath);
			if (!file2.exists()) {
				file2.mkdir();
			} else {
				System.out.println(strFilePath+"��Ŀ¼test���ڣ�");
			}
			break;
		case 3:									//��testĿ¼����file.txt�ļ�
			strFilePath+=File.separator+"file.txt";
			File file3=new File(strFilePath);
				if (!file3.exists()) {
					try {
						file3.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("file.txt�ļ�����");
				}
			break;
		case 4:										//��������
			OutputStream output;
			try {
				output = new FileOutputStream(strFilePath,true);
					output.write("�й�".getBytes());
					output.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (IOException e ) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 5:						//�����ļ�
			System.out.println("���뿽��Ŀ���̣�");
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
						System.out.println("E��file�ļ�����");
					}
			}else{
				System.out.println("E��test�ļ�����");
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
 * ʵ�ַ�װ
 * 
 * inputstream input=new inputstream��
 * ѭ����ȡ����
 * int temp=0��
 * int i=0;
 * byte[] buffer=new byte[100];
 * while((temp=input.read)!=-1){
 *		buffer[i]=(byte) temp;
 *		i++;
 * }
 * input.close();
 * 
*/
