package ��234ҳ������;

import java.util.Scanner;

public class CTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("�����룺���˳������Ρ�Բ�Ρ������Σ�");
			String temp = scanner.next();
			switch (temp) {
			case "�˳�":
				System.exit(0);
				break;
			case "����": {
				CRectagle cRectagle = new CRectagle();
				System.out.println("��������εĳ���");
				cRectagle.setDlength(scanner.nextDouble());
				System.out.println("��������εĿ�");
				cRectagle.setDwidth(scanner.nextDouble());
				cRectagle.getArea();
				cRectagle.getPerimeter();
			}
				break;
			case "Բ��": {
				CCircular cCircular = new CCircular();
				System.out.println("������Բ�εİ뾶��");
				cCircular.setdRadius(scanner.nextDouble());
				cCircular.getArea();
				cCircular.getPerimeter();
			}
				break;
			case "������": {
				CTriangle cTriangle = new CTriangle();
				System.out.println("�����������εĵף�");
				cTriangle.setDbottom(scanner.nextDouble());
				System.out.println("�����������εĸߣ�");
				cTriangle.setDheight(scanner.nextDouble());
				cTriangle.getArea();
				cTriangle.getPerimeter();
			}
				break;
			}
		}
	}
}
