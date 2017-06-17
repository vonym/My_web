package com.bean;


import java.beans.PropertyChangeListener;

import java.beans.PropertyChangeSupport;

public class BoundBean {
	private String value;
	private PropertyChangeSupport support = new PropertyChangeSupport(this);
	
	public String getValue() {
		return value;
	}
/*	Reports a bound property update to listeners that
	have been registered to track updates of all properties
	or a property with the specified name. */
	public void setValue(String value){
		support.firePropertyChange("value",this.value,value );
		this.value = value;
		}
	
	 public void addPropertyChangeListener(PropertyChangeListener listener) {  
         support.addPropertyChangeListener(listener);  
     }  

     public void removePropertyChangeListener(PropertyChangeListener listener) {  
         support.removePropertyChangeListener(listener);  
     }  
	
}
