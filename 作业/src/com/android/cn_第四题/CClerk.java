package com.android.cn_第四题;

public class CClerk extends CEmployee {
	private String strDepartment;
	private int nMoney_Month;
	
	public CClerk() {
		// TODO Auto-generated constructor stub
		super();
		strName="张三";
		nAge=25;
		charSex='男';
		strDepartment="AAT";
		nMoney_Month=3000;
	}

	public String getStrDepartment() {
		return strDepartment;
	}

	public void setStrDepartment(String strDepartment) {
		this.strDepartment = strDepartment;
	}

	public int getnMoney_Month() {
		return nMoney_Month;
	}

	public void setnMoney_Month(int nMoney_Month) {
		this.nMoney_Month = nMoney_Month;
	}
	
}
