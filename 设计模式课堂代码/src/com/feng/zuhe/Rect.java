package com.feng.zuhe;

public class Rect extends Shape {
	public int x0, x1, y0, y1;

	public void Draw() {
		System.out.println("绘制矩形");
	}

	public void AddShape(Shape shape) {
	}
}

class Combo {
	public int x0, x1, y0, y1, x2, y2, radio;

	public void Draw() {
		System.out.println("开始绘制矩形");
		System.out.println("开始绘制圆");
	}
}