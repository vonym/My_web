package com.feng.guanchazhe1;

public class mainTest {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ResourcesClass resourcesClass = new ResourcesClass("a", 12, "b", 45, "c", 90);

		FirstChart firstChart = new FirstChart(resourcesClass);
		firstChart.getResuorce();

		resourcesClass.setNum_a(0);
		resourcesClass.setNum_a(100);
		resourcesClass.setNum_b(100000);
	}
}
