package com.android.cn_第三题;

public class Person {
	protected String strName;
	protected String strAddr;
	protected char charSex;
	protected int nAge;
	
	public Person(String strName,String strAddr,char charSex,int nAge) {
		this.strName=strName;
		this.strAddr=strAddr;
		this.charSex=charSex;
		this.nAge=nAge;
		
	}
	public Person(String strName,String strAddr) {
		this.strName=strName;
		this.strAddr=strAddr;
	}
	
	public Person() {
		strName="张三";
		strAddr="华东交大";
		charSex='男';
		nAge=20;
	}
	
	public void printInfo(){
		System.out.println("人类："+strName+strAddr+charSex+nAge);
	}
}