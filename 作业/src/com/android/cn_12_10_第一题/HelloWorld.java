package com.android.cn_12_10_第一题;

public class HelloWorld {
	public int i;
	public int j;
	public int k;
	
	public void fun() {
		// TODO Auto-generated method stub
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				for (k = 0; k< 10; k++) {
					if (k*100+j*10+i==i*i*i+j*j*j+k*k*k&&(k*100+j*10+i)>100) {
						System.out.println("水仙花数："+(k*100+j*10+i)); 
					}
				}
			}
		}
	}
}
