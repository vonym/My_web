package com.android.cn_������;

public class CManagement extends CEmployee {
	private String strPosition;
	private int nMoney_Year;
	
	public CManagement() {
		// TODO Auto-generated constructor stub
		super();
		strName="����";
		nAge=40;
		charSex='��';
		strPosition="�鳤";
		nMoney_Year=20;
	}

	public String getStrPosition() {
		return strPosition;
	}

	public void setStrPosition(String strPosition) {
		this.strPosition = strPosition;
	}

	public int getnMoney_Year() {
		return nMoney_Year;
	}

	public void setnMoney_Year(int nMoney_Year) {
		this.nMoney_Year = nMoney_Year;
	}
	
}
