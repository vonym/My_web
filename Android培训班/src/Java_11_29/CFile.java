package Java_11_29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CFile {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("************�ļ�����ϵͳ**********");
		System.out.println("************1����ʾD�������ļ�����**********");
		System.out.println("************2����D�̴����ļ���test**********");
		System.out.println("************3����testĿ¼�´���file.txt**********");
		System.out.println("************4������������ݴ���file.txt**********");
		System.out.println("************5�������ļ���C��**********");
		//��ʾD�������ļ�����
		String strFilePathName1="D:\\";
		File file1=new File(strFilePathName1);
		String[] fileList= file1.list();
		for (String string : fileList) {
			System.out.println(string);
		}
		//��D�̴����ļ�test
		String strFilePathName2="D:\\test";
		File file2=new File(strFilePathName2);
		if (!file2.exists()) {
				file2.mkdir();
		} else {
			System.out.println("D��test�ļ�����");
		}
		//��testĿ¼�´���file.tx
		File file=new File(file2, "file.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("D��file�ļ�����");
		}
		//����������ݴ���file.tx
			OutputStream output=new FileOutputStream(file,true);
				try {
					output.write("�й�".getBytes());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    try {
					output.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			//�����ļ���E��
		String strFilePathName3="E:\\test";
		File file3=new File(strFilePathName3);
		if (!file3.exists()) {
			file3.mkdir();
				File file5=new File(strFilePathName3,"file.txt");
				if (!file5.exists()) {
					try {
						InputStream input=new FileInputStream(file);
						OutputStream out=new FileOutputStream(file5);
						int i;
						try {
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
						} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
							e.printStackTrace();
						}
				} else {
					System.out.println("E��file�ļ�����");
				}
		}else{
			System.out.println("E��test�ļ�����");
		}
	}
}
//		Scanner reader=new Scanner(System.in);
//		int num=reader.nextInt();
//		switch (num) {
//		case 1:
//			String strFilePath1="D:\\test";
//			File file1 =new File(strFilePath1);
//			String[] fileStrings= file1.list();
//			for (String string : fileStrings) {
//				System.out.println(fileStrings);
//			}
//			break;
//		case 2:
//			String strFilePath2="D:\\test";
//			File file2=new  File(strFilePath2);
//			if (!file2.exists()) {
//				file2.mkdir();
//			} else {
//				System.out.println("D��Ŀ¼test���ڣ�");
//			}
//			break;
//		case 3:
//			String strFilePath3="D:\\test\\file.txt";
//			File file3=new File(strFilePath3);
//				if (!file3.exists()) {
//					try {
//						file3.createNewFile();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				} else {
//					System.out.println("�ļ����ڣ���");
//				}
//			break;
//		case 4://��������
//			String strFilePath4="D:\\";
//			break;
//		}
