package com.android.cn_2;

public class CTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//StringBuffere��ʹ��
		StringBuffer buffer =new StringBuffer();
		buffer.append('a');
		System.out.println(buffer);
		
		//��������
		CPerson[] person =new CPerson[2];
		//��������
		CPerson zhangsan =new CPerson();
		zhangsan.strName="����";
		person[0]=zhangsan;
		zhangsan.printInfo();
		person[0].printInfo();
		
		//��������
		CPerson lisi=new CPerson();
		lisi.strName="����";
		person[1]=lisi;
		
		//�������
		for (CPerson cPerson : person) {
			cPerson.printInfo();
		}
	}

}
