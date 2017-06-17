package com.briup.day9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest {
	@SuppressWarnings("rawtypes")
	public static void printClass(String name) throws Exception {
		Class c = Class.forName(name);
		System.out.println(c.getPackage() + ";");
		System.out.println(Modifier.toString(c.getModifiers()) + "class"
				+ c.getSimpleName() + "{");
		Field[] fs = c.getDeclaredFields();// 获取当前声明的所有的属性
		for (Field field : fs) {
			System.out.println("\t" + Modifier.toString(field.getModifiers())
					+ " " + field.getType().getSimpleName() + " "
					+ field.getName() + ";");
		}
		Constructor[] cs = c.getConstructors();
		for (Constructor constructor : cs) {
			System.out.println("\t" + constructor + "{}");
		}
		Method[] ms = c.getDeclaredMethods();
		for (Method method : ms) {
			System.out.println("\t" + method + "{}");
		}
		System.out.println("}");

	}

	public static void main(String[] args) throws Exception {
		printClass("com.briup.day9.Person");
	}
}
