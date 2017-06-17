package com.bean;

public class IndexArrayBean {
	private int[] dataSet;

	public void setDataSet(int[] x){
	dataSet=x;
	}
	
	public int[] getDataSet() {
		return dataSet;
	}

	public void setDataSet(int index, int x){
	dataSet[index]=x;
	}

	public int getDataSet(int index){
		return dataSet[index];
	}
	
	
}
