package µÚ234Ò³µÚÁùÌâ;

public class CShopping {
	private double dprice;
	private double dnum;
	private double Sum;
	public double getDprice() {
		return dprice;
	}
	public void setDprice(double dprice) {
		this.dprice = dprice;
	}
	public double getDnum() {
		return dnum;
	}
	public void setDnum(double dnum) {
		this.dnum = dnum;
	}
	public double Sumpay(){
		Sum=dprice*dnum;
		return Sum;
	}
}
