package com.bean;

public class Circle 
{
	private int radius=1;//定义私有变量radius表示圆的半径
	public Circle(){}//无参的构造函数
	public int getRadius()
	{
		return radius;//返回变量radius
	}
	public void setRadius(int rRadius)
	{
		radius=rRadius;//给变量radius赋值
	}
	public double circleLength()
	{
		return Math.PI*radius*2.0;//计算圆的周长
	}
	public double circleArea()
	{
		return Math.PI*radius*radius;//计算圆的面积
	}
}
