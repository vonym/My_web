package com.feng.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Ԫע��
 */
@Target({ ElementType.METHOD, ElementType.TYPE }) // ������
@Retention(RetentionPolicy.RUNTIME) // ��������
@Inherited // ��������̳�
@Documented // ����javadocʱ�����ע��
/*
 * ��ʽ������ ��������() ��Ա���������޵ģ��Ϸ������Ͱ���ԭʼ���ͼ�String��Class��Annotation��Enumeration
 * ���ֻ��һ����Ա�����Ա����ȡ��Ϊvalue()����ʹ��ʱ���Գ�Ա���ƺ͸�ֵ��(=) ע�������ô�г�Ա��û�г�Ա��ע���Ϊ��ʶע��
 */
public @interface Description {
	String value();
	/*
	 * String desc();//�����޲����쳣
	 * 
	 * String atuthor();
	 * 
	 * int age() default 18;//����ָ��Ĭ��ֵ
	 */}
