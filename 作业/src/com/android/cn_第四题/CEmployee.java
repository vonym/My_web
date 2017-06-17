package com.android.cn_第四题;

public class CEmployee {
	public String strName;
	public int nAge;
	public char charSex;
	
	public CEmployee() {
		// TODO Auto-generated constructor stub
		System.out.println("信息：\n");
	}
	/*public void printInfo(){
		System.out.println(strName+nAge+charSex);
	}*/
	
	public String toString(){
		return ("姓名：\n"+strName+"年龄：\n"+nAge+"性别：\n"+charSex);
	}
}
