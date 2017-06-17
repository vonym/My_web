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
		 * class1 == class2���ΪTRUE˵������֮�󼯺ϵķ�����ȥ���ͻ���
		 * Java�м��ϵķ��ͣ��Ƿ�ֹ��������ģ�ֻ�ڱ���׶���Ч���ƹ��������Ч��
		 * ��֤��ͨ�������ķ������������ƹ�����
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
