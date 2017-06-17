package com.feng.zuhe;

public class Combo1 {
	Rect rect;
	Circle circle;

	public Combo1(Rect rect, Circle circle) {
		this.rect = rect;
		this.circle = circle;
	}

	public void Draw() {
		rect.Draw();
		circle.Draw();
	}
}