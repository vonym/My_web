package com.feng.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//��ȡ�����Ϣ��������ĳ�Ա��������Ա����
public class ClassUtil {
	@SuppressWarnings("rawtypes")
	public static void printClassMessage(Object object) {
		Class c = object.getClass();
		System.out.println("������ƣ�" + c.getName());
		// getMethods():��ȡ�����е�public����
		// getDaclaredMethods()����ȡ�����Լ������ķ��������ʷ���Ȩ��
		Method[] ms = c.getMethods();
		for (int i = 0; i < ms.length; i++) {
			// �õ������ķ���ֵ���͵�������
			Class returnType = ms[i].getReturnType();
			System.out.print(returnType.getName() + " ");
			// �õ�����������
			System.out.print(ms[i].getName() + "(");
			// ��ȡ��������-->�õ����ǲ����б�����͵�������
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
