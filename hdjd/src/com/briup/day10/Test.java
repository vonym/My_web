package com.briup.day10;

public class Test {
	public static int divide(int a, int b) throws Exception {
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {
		try {
			divide(10, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
			e.printStackTrace();
		}
	}
}
