package 第234页第五题;

import java.util.Scanner;

public class CTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请输入：（退出、矩形、圆形、三角形）");
			String temp = scanner.next();
			switch (temp) {
			case "退出":
				System.exit(0);
				break;
			case "矩形": {
				CRectagle cRectagle = new CRectagle();
				System.out.println("请输入矩形的长：");
				cRectagle.setDlength(scanner.nextDouble());
				System.out.println("请输入矩形的宽：");
				cRectagle.setDwidth(scanner.nextDouble());
				cRectagle.getArea();
				cRectagle.getPerimeter();
			}
				break;
			case "圆形": {
				CCircular cCircular = new CCircular();
				System.out.println("请输入圆形的半径：");
				cCircular.setdRadius(scanner.nextDouble());
				cCircular.getArea();
				cCircular.getPerimeter();
			}
				break;
			case "三角形": {
				CTriangle cTriangle = new CTriangle();
				System.out.println("请输入三角形的底：");
				cTriangle.setDbottom(scanner.nextDouble());
				System.out.println("请输入三角形的高：");
				cTriangle.setDheight(scanner.nextDouble());
				cTriangle.getArea();
				cTriangle.getPerimeter();
			}
				break;
			}
		}
	}
}
