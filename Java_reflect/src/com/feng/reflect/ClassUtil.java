package com.feng.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获取类的信息，包括类的成员变量、成员方法
public class ClassUtil {
	@SuppressWarnings("rawtypes")
	public static void printClassMessage(Object object) {
		Class c = object.getClass();
		System.out.println("类的名称：" + c.getName());
		// getMethods():获取的所有的public方法
		// getDaclaredMethods()：获取的是自己声明的方法，不问访问权限
		Method[] ms = c.getMethods();
		for (int i = 0; i < ms.length; i++) {
			// 得到方法的返回值类型的类类型
			Class returnType = ms[i].getReturnType();
			System.out.print(returnType.getName() + " ");
			// 得到方法的名称
			System.out.print(ms[i].getName() + "(");
			// 获取参数类型-->得到的是参数列表的类型的类类型
			Class[] paramType = ms[i].getParameterTypes();
			for (Class class1 : paramType) {
				System.out.print(class1.getName() + ",");
			}
			System.out.println(")");
		}
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			Class fieldType = field.getType();
			String typeName = fieldType.getName();
			System.out.println(typeName + " " + field.getName());
		}
	}
}
