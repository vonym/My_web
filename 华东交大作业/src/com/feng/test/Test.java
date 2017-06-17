package com.feng.test;

import com.feng.io.IOTest;

public class Test extends IOTest{
	int[] as;

	public static void main(String[] args) {
		// Test[] test;
		// test = new Test[] {new Test(),new Test()};
		// int[] as=new int[2];
		// int[] as={1,2,3};
		// int x = 4;
		// System.out.println("½á¹û£º" + (x > 4 ? 99.9 : 9));
		// Test test=new Test();
		// System.out.println(test.as);
		// System.out.println(test.as[0]);
		// System.out.println(test.as.length);

		// int[] as = { 100, 90, 101, 40, 10, 2, 13 };
		// for (int i = 0; i < as.length; i++) {
		// for (int j = 0; j < i; j++) {
		// if (as[j] > as[j + 1]) {
		// int temp = as[j];
		// as[j] = as[j + 1];
		// as[j + 1] = temp;
		// }
		// }
		//
		// for (int a : as) {
		// System.out.print(a + " ");
		// }
		// System.out.println();
		// }

		// try {
		// System.out.println("1/0=" + (1 / 0));
		// } finally {
		// System.out.println("finally");
		// }
		
		Test test=new Test();
		test.foo(1, "hahaha");
		test.foo("hahaha", 2);
		
		test.foo(1);
	}

	public void foo(int a, String str) {
		System.out.println(a + str + 1);
	}

	public void foo(String str, int a) {
		System.out.println(str + a + 1);
	}
}
