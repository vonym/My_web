package com.feng.guanchazhe1;

public class ResourcesClass {
	private String name_a, name_b, name_c;
	private int num_a, num_b, num_c;

	public ResourcesClass() {
	}

	public ResourcesClass(String name_a, int num_a, String name_b, int num_b, String name_c, int num_c) {
		this.name_a = name_a;
		this.name_b = name_b;
		this.name_c = name_c;
		this.num_a = num_a;
		this.num_b = num_b;
		this.num_c = num_c;
	}

	public String getName_a() {
		return name_a;
	}

	public void setName_a(String name_a) {
		this.name_a = name_a;
	}

	public String getName_b() {
		return name_b;
	}

	public void setName_b(String name_b) {
		this.name_b = name_b;
	}

	public String getName_c() {
		return name_c;
	}

	public void setName_c(String name_c) {
		this.name_c = name_c;
	}

	public int getNum_a() {
		return num_a;
	}

	public void setNum_a(int num_a) {
		this.num_a = num_a;
		FirstChart.getResuorce();
	}

	public int getNum_b() {
		return num_b;
	}

	public void setNum_b(int num_b) {
		this.num_b = num_b;
		FirstChart.getResuorce();
	}

	public int getNum_c() {
		return num_c;
	}

	public void setNum_c(int num_c) {
		this.num_c = num_c;
		FirstChart.getResuorce();
	}

}
