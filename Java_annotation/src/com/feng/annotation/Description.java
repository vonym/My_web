package com.feng.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 元注解
 */
@Target({ ElementType.METHOD, ElementType.TYPE }) // 作用域
@Retention(RetentionPolicy.RUNTIME) // 生命周期
@Inherited // 允许子类继承
@Documented // 生成javadoc时会包含注解
/*
 * 格式：类型 变量名称() 成员类型是受限的，合法的类型包括原始类型及String、Class、Annotation、Enumeration
 * 如果只有一个成员，则成员必须取名为value()，在使用时忽略成员名称和赋值号(=) 注解类可以么有成员。没有成员的注解称为标识注解
 */
public @interface Description {
	String value();
	/*
	 * String desc();//必须无参无异常
	 * 
	 * String atuthor();
	 * 
	 * int age() default 18;//可以指定默认值
	 */}
