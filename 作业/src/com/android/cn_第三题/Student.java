package com.android.cn_������;

public class Student extends Person {
	private int nMath;
	private int nEnglish;
	
	public Student(String strName,String strAddr,char charSex,int nAge,int nMath,int nEnglish) {
		this.strName=strName;
		this.strAddr=strAddr;
		this.charSex=charSex;
		this.nAge=nAge;
		this.nMath=nMath;
		this.nEnglish=nEnglish;
	}
	
	public Student(String strName,String strAddr) {
		this.strName=strName;
		this.strAddr=strAddr;
	}
	
	public Student() {
		strName="����";
		strAddr="��������";
		charSex='��';
		nAge=18;
		nMath=80;
		nEnglish=90;
	}
	
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("ѧ����"+strName+strAddr+charSex+nAge+nMath+nEnglish);
	}
}
