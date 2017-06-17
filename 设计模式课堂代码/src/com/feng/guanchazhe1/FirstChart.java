package com.feng.guanchazhe1;

public class FirstChart {

	private static ResourcesClass resourcesClass;

	@SuppressWarnings("static-access")
	public FirstChart(ResourcesClass resourcesClass) {
		this.resourcesClass = resourcesClass;
	}

	public static void getResuorce() {
		System.out.println(resourcesClass.getName_a() + ":" + resourcesClass.getNum_a() + "\n"
				+ resourcesClass.getName_b() + ":" + resourcesClass.getNum_b() + "\n" + resourcesClass.getName_c() + ":"
				+ resourcesClass.getNum_c());
	}
}
