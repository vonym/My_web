package com.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;


public class ConstrainBean {
	private String value="李四";
	private VetoableChangeSupport vSupport = new VetoableChangeSupport(this);
	//private PropertyChangeSupport pSupport = new PropertyChangeSupport(this);
	public String getValue() {
		return value;
	}
	public void setValue(String value) throws PropertyVetoException {
		//pSupport.firePropertyChange("value",this.value,value);
		vSupport.fireVetoableChange("value",this.value,value);
		this.value = value;	
		
	}
	
	public void addVetoableChangeListener(VetoableChangeListener listener) {  
        vSupport.addVetoableChangeListener(listener);  
    }  

    public void removeVetoableChangeListener(VetoableChangeListener listener) {  
        vSupport.removeVetoableChangeListener(listener);  
    } 
    
  /*  public void addPropertyChangeListener(PropertyChangeListener listener) {  
    	pSupport.addPropertyChangeListener(listener);  
    }  

    public void removePropertyChangeListener(PropertyChangeListener listener) {  
    	pSupport.removePropertyChangeListener(listener);  
    }  */
	

}
