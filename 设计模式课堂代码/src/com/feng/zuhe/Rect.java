package com.feng.zuhe;

public class Rect extends Shape {
	public int x0, x1, y0, y1;

	public void Draw() {
		System.out.println("���ƾ���");
	}

	public void AddShape(Shape shape) {
	}
}

class Combo {
	public int x0, x1, y0, y1, x2, y2, radio;

	public void Draw() {
		System.out.println("��ʼ���ƾ���");
		System.out.println("��ʼ����Բ");
	}
}