package ��234ҳ������;

public class CCircular extends CShape {
	private double dRadius;

	public double getdRadius() {
		return dRadius;
	}

	public void setdRadius(double dRadius) {
		this.dRadius = dRadius;
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Բ�������" + Math.PI * dRadius * dRadius);
	}

	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Բ�����L��" + Math.PI * dRadius * 2);
	}

}
