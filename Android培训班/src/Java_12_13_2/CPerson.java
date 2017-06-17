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
		System.out.println("姓名："+this.strName+"地址："+this.strAddr+"性别："+this.charSex+"年龄："+this.nAge);
	}
}
