package ��234ҳ������;

public class CClerk extends CStaff {
	private String strDepartment;
	private int nWage;

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("������" + this.strName + "\n���䣺" + this.nAge + "\n�Ա�"
				+ this.charSex + "\n���ţ�" + this.strDepartment + "\n��н��"
				+ this.nWage);
	}

	public String getStrDepartment() {
		return strDepartment;
	}

	public void setStrDepartment(String strDepartment) {
		this.strDepartment = strDepartment;
	}

	public int getnWage() {
		return nWage;
	}

	public void setnWage(int nWage) {
		this.nWage = nWage;
	}

}
