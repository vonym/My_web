package com.briup.day12.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BridgeIOTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					"src/com/briup/day12/io/data.txt")));
			bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("src/com/briup/day12/io/data.txt",
							true)));
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
				bw.write(s+"\n");
			}
			bw.flush();
			// bw.write("我是通过BufferedWriter写入的数据。。。。。。\n");
			// bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// InputStreamReader isr = null;
		// try {
		// isr = new InputStreamReader(new FileInputStream(
		// "src/com/briup/day12/io/data.txt"), "GBK");
		// char[] c = new char[100];
		// isr.read(c);
		// System.out.println(new String(c));
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// } catch (UnsupportedEncodingException e) {
		// e.printStackTrace();
		// } catch (IOException e) {
		// e.printStackTrace();
		// } finally {
		// try {
		// if (isr != null) {
		// isr.close();
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }

		// OutputStreamWriter osw = null;
		// try {
		// osw = new OutputStreamWriter(new FileOutputStream(
		// "src/com/briup/day12/io/data.txt",true), "UTF-8");
		// osw.write("\n我是OutputStreamWriter写入的数据，编码方式是:" + osw.getEncoding());
		// osw.flush();
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// } catch (UnsupportedEncodingException e) {
		// e.printStackTrace();
		// } catch (IOException e) {
		// e.printStackTrace();
		// } finally {
		// try {
		// if (osw != null) {
		// osw.close();
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }

	}
}
