package com.android.cn_������;

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
		strName="����";
		strAddr="��������";
		charSex='��';
		nAge=20;
	}
	
	public void printInfo(){
		System.out.println("���ࣺ"+strName+strAddr+charSex+nAge);
	}
}