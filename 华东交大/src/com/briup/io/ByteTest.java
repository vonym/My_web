package com.briup.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteTest {

	public static void main(String[] args) {
		try {
			byte[] b = { 1, 2, 3, 4, 5 };
			ByteArrayInputStream is = new ByteArrayInputStream(b);
			BufferedInputStream bis = new BufferedInputStream(is, 2);
			// System.out.println(bis.markSupported());
			System.out.println(bis.read());
			System.out.println("mark");
			bis.mark(2);// 在多少个有效
			System.out.println("first:" + bis.read());
			System.out.println("first:" + bis.read());
			System.out.println("reset");
			bis.reset();
			System.out.println("second:" + bis.read());
			System.out.println("second:" + bis.read());
			System.out.println("second:" + bis.read());
			System.out.println("reset");
			bis.reset();
			System.out.println("third:" + bis.read());
			// int num=20>>2;// 20/2^2=5
			// int num=-20>>2;// -20/2^2=-5
			// int num=-10>>2;// -10/2^2=-3
			// int num = -130 >> 2;
			// System.out.println(num);
			// int num = 10 << 2; // 10*2^2=40;不管正负数都乘以2的几次方
			// ByteArrayOutputStream os = new ByteArrayOutputStream();
			// os.write(10);
			// os.write(-10);
			// byte[] b = os.toByteArray();
			// ByteArrayInputStream is = new ByteArrayInputStream(b);
			// // is.skip(1);//跳过几个可以为负数，负数与0效果一样
			// int data = 0;
			// while ((data = is.read()) != -1) {
			// System.out.println(data);
			// }
			// for (int i = 0; i < b.length; i++) {
			// System.out.println(b[i]);
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
