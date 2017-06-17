package com.bean;

import org.apache.catalina.filters.AddDefaultCharsetFilter;


public class ReflectPointBean {

	public int x;  
	public int y;  
	
	public ReflectPointBean() {  
	
		
	}  
	  
	public int getX() {  
	return x;  
	}  
	  
	public void setX(int x) {  
	this.x = x;  
	}  
	  
	public int getY() {  
	return y;  
	}  
	  
	public void setY(int y) {  
	this.y = y;  
	}

	public int plus(){
		return x+y;	
	}
	
	
}
