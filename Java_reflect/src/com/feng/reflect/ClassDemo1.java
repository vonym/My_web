package com.feng.reflect;
/*
 * Java����
 */
public class ClassDemo1 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Foo foo = new Foo();
		/*
		 * Class��ʵ�������ʾ�����ַ�ʽ
		 */
		Class c1 = Foo.class;
		Class c2 = foo.getClass();
		try {
			Class c3 = Class.forName("com.feng.reflect.Foo");
			System.out.println(c1 == c2);
			System.out.println(c2 == c3);
			Foo foo1 = (Foo) c3.newInstance();//��Ҫ�޲ι��췽��
			foo1.print();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class Foo {
	public void print() {
		System.out.println("foo");
	}
}
