package 第234页第四题;

public class CStaff {
	public String strName;
	public int nAge;
	public char charSex;

	CStaff() {
		strName="张山";
		nAge=20;
		charSex='男';
	}

	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("姓名：" + this.strName + "\n年龄：" + this.nAge + "\n性别："
				+ this.charSex);
	}
}
