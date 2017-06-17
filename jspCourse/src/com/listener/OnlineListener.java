package com.listener;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

import com.bean.UserList;

public class OnlineListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent e) {
		// TODO Auto-generated method stub
		UserList.addUser(String.valueOf(e.getValue()));   
        System.out.println("session(" + e.getSession().getId() + ")增加属性"  
            + e.getName() + "，值为" + e.getValue());  
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent e) {
		// TODO Auto-generated method stub
		 UserList.removeUser(String.valueOf(e.getValue()));    
	     System.out.println("session(" + e.getSession().getId() + ")移除属性"  
	    		 + e.getName() + "，值为" + e.getValue());  
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent e) {
		// TODO Auto-generated method stub
		 String oldValue=String.valueOf(e.getValue());  
	        String newValue=  String.valueOf(e.getSession().getAttribute(e.getName()));  
	        UserList.removeUser(oldValue);   
	        UserList.addUser(newValue);  
	        System.out.println("session(" + e.getSession().getId() + ")属性"  
	            + e.getName() + "的值，由"+oldValue+"更改为" + newValue);  
	}
	
	 //编写操作监听方法,Http会话的创建监听 ,  
    public void sessionCreated(HttpSessionEvent e) {  
        System.out.println("创建新会话session("+e.getSession().getId()+")");  
    }  
  
    //Http会话的销毁监听   
    public void sessionDestroyed(HttpSessionEvent e) {  
        System.out.println("销毁会话session("+e.getSession().getId()+")");  
    }  
    //编写操作上下文方法,监听ServletContext创建  
    public void contextInitialized(ServletContextEvent e) {  
        System.out.println("ServletContext初始化......");  
    }  
    //监听ServletContext销毁  
    public void contextDestroyed(ServletContextEvent e) {  
        System.out.println("ServletContext被销毁......");   
    }  
    //编写输出信息方法  
    private void print(String message) {      
        PrintWriter out = null;  
        try {  
            out = new PrintWriter(new   
                FileOutputStream("d:\\log.txt", true));   
            out.println(new   
                SimpleDateFormat("yyyy-MM-dd HH:mm:ss").  
                format(new Date())  
                + " " + message);  
                out.close();  
        }catch (Exception e){  
                e.printStackTrace();  
        }  
    }  

	

}
