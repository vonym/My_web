package 第234页第四题;

public class CManagement extends CStaff {
	private String strJob;
	private int nAnnualPension;

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("姓名：" + this.strName + "\n年龄：" + this.nAge + "\n性别："
				+ this.charSex + "\n部门：" + this.strJob + "\n年薪："
				+ this.nAnnualPension);
	}

	public String getStrJob() {
		return strJob;
	}

	public void setStrJob(String strJob) {
		this.strJob = strJob;
	}

	public int getnAnnualPension() {
		return nAnnualPension;
	}

	public void setnAnnualPension(int nAnnualPension) {
		this.nAnnualPension = nAnnualPension;
	}
}
