package com.feng.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ClassDemo4 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("hello");
		System.out.println(list == list2);
		Class class1 = list.getClass();
		Class class2 = list2.getClass();
		System.out.println(class1 == class2);
		/*
		 * class1 == class2结果为TRUE说明编译之后集合的泛型是去泛型化得
		 * Java中集合的泛型，是防止错误输入的，只在编译阶段有效，绕过编译就无效了
		 * 验证：通过方法的反射来操作，绕过编译
		 */
		try {
			Method method = class1.getMethod("add", Object.class);
			method.invoke(list2, 20);
			System.out.println(list2.size());
			System.out.println(list2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
