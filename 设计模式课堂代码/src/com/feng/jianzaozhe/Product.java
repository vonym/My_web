package com.feng.jianzaozhe;

import java.util.ArrayList;
import java.util.List;

public class Product {
	List<String> parts = new ArrayList<>();

	public void Add(String part) {
		parts.add(part);
	}

	public void Show() {
		System.out.println("��Ʒ      ����-----");
		for (String str : parts) {
			System.out.println(str);
		}
	}
}
