package com.bean;

public class Scope {
	public Scope()									//无参的构造函数
	{
		
	}
	private int number=0;							//初始化变量number的值为0
	public int getNmuber(){							//增加并返回变量number的值
		number++;
		return number;
	}
	public void setNumber(int newNumber) {	
		this.number = newNumber;					//给变量number赋新值
	}
}
