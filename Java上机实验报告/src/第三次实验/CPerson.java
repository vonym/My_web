package ������ʵ��;

public class CPerson {
	public String strName;
	public char charSex;
	public CPerson() {
		strName="����";
		charSex='��';
	}
	public String toString(){
		return "��Ϣ��\n"+"������"+strName+"\n"+"�Ա�"+charSex;
	}
	public void say(){
		System.out.println("�˻�˵����");
	}
}
