package ��234ҳ������;

public class CTriangle extends CShape {
	private double dbottom;
	private double dheight;

	public double getDbottom() {
		return dbottom;
	}

	public void setDbottom(double dbottom) {
		this.dbottom = dbottom;
	}

	public double getDheight() {
		return dheight;
	}

	public void setDheight(double dheight) {
		this.dheight = dheight;
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("�����������" + dbottom * dheight * 0.5);
	}

	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("�������ܳ���........");
	}

}
