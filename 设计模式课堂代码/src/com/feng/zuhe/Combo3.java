package com.feng.zuhe;

import java.util.ArrayList;
import java.util.List;

public class Combo3 extends Shape {
	List<Shape> shapes = new ArrayList<>();

	public void AddShape(Shape shape) {
		shapes.add(shape);
	}

	public void Draw() {
		System.out.println("��ʼ�������ͼ��");
		for (int i = 0; i < shapes.size(); i++) {
			shapes.get(i).Draw();
		}
		System.out.println("�����������ͼ��");
	}
}