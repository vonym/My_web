package Java_12_13_2;

public class CStudent extends CPerson{
	public double dMath;
	public double denglish;
	CStudent(String strName,String strAddr){}
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("������"+this.strName+"��ַ��"+this.strAddr+"�Ա�"+this.charSex+"���䣺"
		+this.nAge+"��ѧ�ɼ���"+this.dMath+"Ӣ��ɼ���"+this.denglish);
	}
}
