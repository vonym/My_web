package com.bean;

public class Counter{
	//初始化JavaBean的成员变量
	int count = 0;
	// Class构造器
	public Counter() {
	}
	// 属性Count的Get方法
	public int getCount() {
	//计数操作，每一次请求都进行计数器加一
	count++;
	return this.count;
	}
	//属性Count的Set方法
	public void setCount(int count) {
	this.count = count;
	}
	
	
	}
