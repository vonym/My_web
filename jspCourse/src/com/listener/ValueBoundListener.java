package com.listener;

import java.beans.PropertyChangeEvent;

import java.beans.PropertyChangeListener;


public class ValueBoundListener implements PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		System.out.println(evt.getOldValue() + "->" + evt.getNewValue());  
	}

}
