package com.android.cn_������;

public class CEmployee {
	public String strName;
	public int nAge;
	public char charSex;
	
	public CEmployee() {
		// TODO Auto-generated constructor stub
		System.out.println("��Ϣ��\n");
	}
	/*public void printInfo(){
		System.out.println(strName+nAge+charSex);
	}*/
	
	public String toString(){
		return ("������\n"+strName+"���䣺\n"+nAge+"�Ա�\n"+charSex);
	}
}
