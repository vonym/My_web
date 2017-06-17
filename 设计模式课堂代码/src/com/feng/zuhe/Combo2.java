package com.feng.zuhe;

import java.util.ArrayList;
import java.util.List;

public class Combo2 extends Shape {
	List<Rect> rects = new ArrayList<>();
	List<Circle> circles = new ArrayList<>();
	List<Tri> tris = new ArrayList<>();

	public void AddRect(Rect rect) {
		rects.add(rect);
	}

	public void AddCircle(Circle circle) {
		circles.add(circle);
	}

	public void AddTri(Tri tri) {
		tris.add(tri);
	}

	public void Draw() {
		for (int i = 0; i < rects.size(); i++) {
			rects.get(i).Draw();
		}
		for (int i = 0; i < circles.size(); i++) {
			circles.get(i).Draw();
		}
		for (int i = 0; i < tris.size(); i++) {
			tris.get(i).Draw();
		}
	}
}
