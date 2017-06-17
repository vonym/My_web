package 第234页第五题;

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
		System.out.println("圆形面积：" + Math.PI * dRadius * dRadius);
	}

	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("圆形周長：" + Math.PI * dRadius * 2);
	}

}
