package ��234ҳ������;

public class CManagement extends CStaff {
	private String strJob;
	private int nAnnualPension;

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("������" + this.strName + "\n���䣺" + this.nAge + "\n�Ա�"
				+ this.charSex + "\n���ţ�" + this.strJob + "\n��н��"
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
