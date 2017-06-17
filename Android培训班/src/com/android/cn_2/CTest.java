package com.android.cn_2;

public class CTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//StringBuffere的使用
		StringBuffer buffer =new StringBuffer();
		buffer.append('a');
		System.out.println(buffer);
		
		//对象数组
		CPerson[] person =new CPerson[2];
		//创建张三
		CPerson zhangsan =new CPerson();
		zhangsan.strName="张三";
		person[0]=zhangsan;
		zhangsan.printInfo();
		person[0].printInfo();
		
		//创建李四
		CPerson lisi=new CPerson();
		lisi.strName="李四";
		person[1]=lisi;
		
		//数组遍历
		for (CPerson cPerson : person) {
			cPerson.printInfo();
		}
	}

}
