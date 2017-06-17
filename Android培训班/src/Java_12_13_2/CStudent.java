package Java_12_13_2;

public class CStudent extends CPerson{
	public double dMath;
	public double denglish;
	CStudent(String strName,String strAddr){}
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("姓名："+this.strName+"地址："+this.strAddr+"性别："+this.charSex+"年龄："
		+this.nAge+"数学成绩："+this.dMath+"英语成绩："+this.denglish);
	}
}
