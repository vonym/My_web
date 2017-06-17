package com.android.cn_µÚ¶þÌâ;

public class CChangfangxing extends CTuxing {
	
	private double dChang;
	private double dKuang;

	public double getdChang() {
		return dChang;
	}

	public void setdChang(double dChang) {
		this.dChang = dChang;
	}

	public double getdKuang() {
		return dKuang;
	}

	public void setdKuang(double dKuang) {
		this.dKuang = dKuang;
	}

	public double Zhouchang(){
		// TODO Auto-generated method stub
		
		return ((dChang+dKuang)*2.0);
	}

	public double Area() {
		// TODO Auto-generated method stub
		return (dChang*dKuang);
	}

}
