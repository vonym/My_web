package com.feng.zuhe;

public class mainTest {
	public static void main(String[] args) {
		Shape rect = new Rect();
		Shape circle = new Circle();
		Shape tri = new Tri();
		Combo3 combo = new Combo3();
		combo.AddShape(rect);
		combo.AddShape(circle);
		combo.AddShape(tri);
		Combo3 combo2 = new Combo3();
		Shape cir2 = new Circle();
		combo2.AddShape(combo);
		combo2.AddShape(cir2);
		combo2.Draw();
	}
}
