package com.briup.day9;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
	// ����������������
	public static Object getInstance(String clsName) throws Exception {
		return Class.forName(clsName).newInstance();
		// Class c=Class.forName(clsName);
		// Constructor constructor=c.getConstructor();
		// Constructor constructor2=c.getConstructor(String.class,int.class);
		// return constructor.newInstance();
		// return constructor2.newInstance("zhangsan",10);

	}

	// ���ݶ�������Բ������������
	@SuppressWarnings("rawtypes")
	public static void fieldOper(Object obj, String fieldName, Object value)
			throws Exception {
		Class c = obj.getClass();
		Field f = c.getDeclaredField(fieldName);
		// ���ÿɷ���Ȩ��
		f.setAccessible(true);
		System.out.println("ԭ����ֵ��" + f.get(obj));
		f.set(obj, value);
	}

	// ���ݶ����Լ��������Ƶ��÷���ִ��
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void methodOper(Object obj, String methodName,
			Class[] argType, Object... args) throws Exception {
		Class c = obj.getClass();
		Method m = c.getDeclaredMethod(methodName, argType);
		Object result = m.invoke(obj, args);
		System.out.println("����ִ��֮��ķ��ؽ����" + result);
	}

	public static void main(String[] args) throws Exception {
		Object obj = getInstance("com.briup.day9.Person");
		System.out.println(obj);
		fieldOper(obj, "age", 20);
		System.out.println(obj);
		methodOper(obj, "setName", new Class[] { String.class }, "wangwu");
		System.out.println(obj);
	}
}
