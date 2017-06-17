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
			file.createNewFile();//创建文件
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*创建文件夹
		 * 第一步：创建文件夹
		 * 第二步：创建文件
		 * 
		*/
		String strFilePath1="c:"+File.separator+"test"+File.separator+"1.txt";
		File file2=new File(strFilePath1);
		/*删除文件（夹）
		 * 获取文件对象
		 */
		file2.delete();
	}

}
