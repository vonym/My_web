package Java_12_13_2;


public class CPerson {
	protected String strName;
	protected String strAddr;
	protected char charSex;
	protected int nAge;
	CPerson(String strName,String strAddr,char charSex,int nAge){
		this.strName=strName;
		this.strAddr=strAddr;
		this.charSex=charSex;
		this.nAge=nAge;
	}
	CPerson(){
		
	}
	public void printInfo(){
		System.out.println("������"+this.strName+"��ַ��"+this.strAddr+"�Ա�"+this.charSex+"���䣺"+this.nAge);
	}
}
