package ��234ҳ������;

public class CRectagle extends CShape {
	private double dlength;
	private double dwidth;

	public double getDlength() {
		return dlength;
	}

	public void setDlength(double dlength) {
		this.dlength = dlength;
	}

	public double getDwidth() {
		return dwidth;
	}

	public void setDwidth(double dwidth) {
		this.dwidth = dwidth;
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("�����������" + dlength * dwidth);
	}

	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("�������ܳ���" + (dlength + dwidth) * 2);
	}

}
