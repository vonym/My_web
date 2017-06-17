package com.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

import org.omg.CORBA.PRIVATE_MEMBER;

public class ValueConstrainedListener implements 
		VetoableChangeListener {
	
	@Override
	public void vetoableChange(PropertyChangeEvent evt)
			throws PropertyVetoException {
	
		// TODO Auto-generated method stub
       System.out.println(evt.getOldValue() + "->" + evt.getNewValue());  
       throw new PropertyVetoException("拒绝修改属性",evt);  
	}

	/*public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		System.out.println(evt.getOldValue() + "->" + evt.getNewValue());  
	}
*/
}
