package com.android.cn_12_10_µÚ12Ìâ;

public class HelloWorld {
	public void fun() {
		// TODO Auto-generated method stub
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5-i-1; j++) {
//				System.out.print(" ");
//				for (int k= 0; k<2*j+1; k++) {
//					System.out.print(" *");
//				}
//				System.out.println();
//			}
//		}
		for (int i = 0; i < 5; i++) {
			for (int row = 0; row <= i; row++) {
				System.out.print("*");
				for (int lie = 0; lie<i; lie++) {
					if (lie==(row+1)/2) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
