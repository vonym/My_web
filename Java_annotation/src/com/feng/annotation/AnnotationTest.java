package com.feng.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		try {
			Class class1 = Class.forName("com.feng.annotation.Child");
			if (class1.isAnnotationPresent(Description.class)) {
				Description description = (Description) class1.getAnnotation(Description.class);
				System.out.println(description.value());
			}
			Method[] methods = class1.getMethods();
			for (Method method : methods) {
				if (method.isAnnotationPresent(Description.class)) {
					Annotation[] annotation = method.getAnnotations();
					for (Annotation annotation2 : annotation) {
						Description description = (Description) annotation2;
						System.out.println(description.value());
					}
				}

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
