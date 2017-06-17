import java.util.Scanner;

public class Text8 {
	public class Juxing{
		private double length;
		private double heigth;
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public double getHeigth() {
			return heigth;
		}
		public void setHeigth(double heigth) {
			this.heigth = heigth;
		}	
		public double getArea(double length,double heigth){
			return length*heigth;
		}
		public double getZhouchang(double length,double heigth){
			return (length+heigth)*2;
		}
	}
	public static void main(String[] args){
		Text8 text8=new Text8();
		Juxing juxing=text8. new Juxing();
		Scanner reader1=new Scanner(System.in);
		double length=reader1.nextInt();
		Scanner reader2=new Scanner(System.in);
		double heigth=reader2.nextInt();
		double Area=juxing.getArea(length, heigth);
		double Zhouchang=juxing.getZhouchang(length, heigth);
		System.out.println("面积为："+Area);
		System.out.println("周长为："+Zhouchang);
		reader1.close();
		reader2.close();
	}
}
