package Java_11_29;

import java.io.File;
import java.io.IOException;

public class CTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strFilePath="c:"+File.separator+"1.txt";
		File file =new File(strFilePath);
		//c:\ \   windows
		//c:/ /    Linux
		try {
			file.createNewFile();//�����ļ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*�����ļ���
		 * ��һ���������ļ���
		 * �ڶ����������ļ�
		 * 
		*/
		String strFilePath1="c:"+File.separator+"test"+File.separator+"1.txt";
		File file2=new File(strFilePath1);
		/*ɾ���ļ����У�
		 * ��ȡ�ļ�����
		 */
		file2.delete();
	}

}
