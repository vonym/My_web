package com.feng.io;

public class IOTest {
	public static void main(String[] args) {
		//int a = 5;
		// System.out.println("======�����������======");
		// for (int i = 0; i < a; i++) {
		// for (int j = 0; j <=i; j++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }
		// System.out.println("======��ߵ�������======");
		// for (int i = a; i > 0; i--) {
		// for (int j = 0; j <=i; j++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }
		// System.out.println("======��ӡ����������======");
		// for (int i = a; i > 0; i--) {
		// for (int j = 0; j <= i; j++) {
		// System.out.print(" ");
		// }
		// for (int k = 0; k <= (a - i); k++) {
		// System.out.print("*");
		// }
		// System.out.println("");
		// }
		// System.out.println("======��ӡ�ҵ�������======");
		// for (int i = 0; i < a; i++) {
		// for (int j = 0; j < i; j++) {
		// System.out.print(" ");
		// }
		// for (int k = 0; k < (a - i); k++) {
		// System.out.print("*");
		// }
		// System.out.println("");
		// }
		// System.out.println("======��ӡ����������======");
		// for (int i = 9; i > 0; i--) {
		// for (int j = 0; j <= i; j++) {
		// System.out.print(" ");
		// }
		// for (int k = 0; k <= (9 - i); k++) {
		// System.out.print("* ");
		// }
		// System.out.println("");
		// }
		System.out.println("======��ӡ����������======");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (9 - i); k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// System.out.println("======��ӡ������״======");
		// for (int i = 5; i < 10; i++) {
		// for (int j = 0; j < i; j++) {
		// System.out.print(" ");
		// }
		// }

	}

	protected void foo(int a) {
	}

	void foo() {
	}

}
