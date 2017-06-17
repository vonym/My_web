package com.bean;

import java.beans.PropertyDescriptor;
import java.beans.PropertyVetoException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.listener.ValueBoundListener;
import com.listener.ValueConstrainedListener;

import java.lang.reflect.Field;  
import java.lang.reflect.Method;

public class Course5 {
	
	//用反射获得指定JAVABean属性的值  
	private static void getProperty(ReflectPointBean rp)  
	throws Exception {  
	Field field = rp.getClass().getDeclaredField("x");  
	System.out.println("x属性值为："+field.get(rp));;  
	}  
	
	//用反射获得指定JAVABean属性的值  
	private static Object getProperty(Object obj, String fieldName) throws Exception{  
		//Class clazz = Class.forName(className);
		
		Class clazz = obj.getClass();
		Field field = clazz.getField(fieldName);
		Object property = field.get(obj);
		return property;
	}
	/*A PropertyDescriptor describes one 
	property that a Java Bean exports 
	via a pair of accessor methods.*/
	/*Gets the method that should be
	 *  used to write the property value..*/


	private static void setProperty(Object obj, String fieldName,Object value) throws Exception{  
		Class clazz = obj.getClass();
		PropertyDescriptor pdDescriptor = new PropertyDescriptor(fieldName, clazz);
		Method method = pdDescriptor.getWriteMethod();
		method.invoke(obj,value);	
	}
	//用反射获得指定JAVABean方法的值  
	public static Object invokeMethod(Object obj, String methodName) throws Exception {
	    Class clazz = obj.getClass();
	    Method method = clazz.getMethod(methodName);
	    return method.invoke(obj);
	}
	
		  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//simple属性
		SimpleBean simple = new SimpleBean();
		simple.setUsername("张三");
		System.out.println(simple.getUsername());
		
		simple.setEnabled(true);
		System.out.println(simple.isEnabled());
		System.out.println("===================index属性================================");
		//index属性
			//array
		IndexArrayBean indexArrayBean = new IndexArrayBean();
		int[] array = {1,2,3,4,5,6};
		
		indexArrayBean.setDataSet(array);
		indexArrayBean.setDataSet(1, 9);
		System.out.println(indexArrayBean.getDataSet(1));
		 indexArrayBean.getDataSet();
		for(int i=0;i<indexArrayBean.getDataSet().length;i++){
			System.out.println(indexArrayBean.getDataSet(i));
		}
			//map
		IndexMapBean indexMapBean = new IndexMapBean();
		
		
		Map map = new HashMap();
		
		map.put("username", "李四");
		map.put("password", "7890");
		/*for(Map.Entry<String, String> entry:map.entrySet()){
			
		}*/
		indexMapBean.setMap(map);
		System.out.println(indexMapBean.getMap());
		String username = indexMapBean.getMap("username").toString();
		//map.get("username");
		System.out.println(username);
		
		//System.out.println(map.get("username"));*/
		System.out.println("===============bound属性====================================");

		//bound属性
		
		BoundBean boundBean = new BoundBean();  
	        //添加观察者监听器  
		ValueBoundListener valueBListener = new ValueBoundListener();
		boundBean.addPropertyChangeListener(valueBListener);
		//boundBean.removePropertyChangeListener(valueBListener);
        for (int i = 0; i < 10; i++) {  
        	boundBean.setValue("张三"+i);  	
        } 
		System.out.println("===============Constrain属性====================================");

        //contrained
        ConstrainBean constrainBean = new ConstrainBean();
        //添加观察者监听器  
        ValueConstrainedListener valueCLisntener=new ValueConstrainedListener();
        
        constrainBean.addVetoableChangeListener(valueCLisntener);
        //constrainBean.removeVetoableChangeListener(valueCLisntener);
        for (int i = 0; i < 10; i++) { 
        	try {
				constrainBean.setValue("李四"+i);
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				System.out.println(constrainBean.getValue());
				System.out.println(e.getMessage());
				
			}
        	} 
  System.out.println("=====================javabean 反射==============================");	
  /*
   * JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；
   * 对于任意一个对象，
   * 都能够调用它的任意一个方法；
   * 这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。
   *  通俗点说：它就表示一个类在照镜子，自我审视。反射就是让你可以通过名称来得到对象（类，属性，方法）。
   *  Java反射机制主要提供了以下功能： 在运行时判断任意一个对象所属的类；在运行时构造任意一个类的对象；
   *  在运行时判断任意一个类所具有的成员变量和方法；在运行时调用任意一个对象的方法；生成动态代理。
  */
  ReflectPointBean rp = new ReflectPointBean(); 
  rp.setX(1);
  rp.setY(2);
  	try {
  		getProperty(rp);
		Object property = getProperty(rp,"y");
		System.out.println("y属性值为:"+property.toString());
		Object result = invokeMethod(rp,"plus");
		System.out.println("method结果为:"+result.toString());
		
		//Object value = 7;
		int value = 7;
		setProperty(rp, "y",value);
		Object property1 = getProperty(rp,"y");
		System.out.println("y属性值为:"+property1.toString());
		Object result1 = invokeMethod(rp,"plus");
		System.out.println("method结果为:"+result1.toString());

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
    
  	 
	}  
		
		
		
	

}
