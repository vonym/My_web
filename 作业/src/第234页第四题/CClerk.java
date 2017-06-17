package 第234页第四题;

public class CClerk extends CStaff {
	private String strDepartment;
	private int nWage;

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("姓名：" + this.strName + "\n年龄：" + this.nAge + "\n性别："
				+ this.charSex + "\n部门：" + this.strDepartment + "\n月薪："
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
