package com.listener;

import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ContextLog implements ServletContextListener {

	private Logger log=null; 
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		  String name=arg0.getServletContext().getServletContextName();  
          
	      log.info(new Date()+"   " + "servletContext shut down "+(name==null?"":name));
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
		 	ServletContext context=arg0.getServletContext();  
	        String realpath=context.getRealPath("/");  
	        String fileSep=System.getProperty("file.separator");  
	          
	        if(realpath!=null&&(!realpath.endsWith(fileSep)))  
	        {  
	            realpath=realpath+fileSep; 
	            
	            System.out.println("reqlPath:" + realpath);
	        }  
	          
	        PropertyConfigurator.configure(realpath+"/WEB-INF/classes/"+context.getInitParameter("logger-config"));  
	        log=Logger.getLogger(ContextLog.class);  
	          
	        String name=context.getServletContextName();  
	          
	        log.info(new Date()+"   "+realpath+ " " + "servlet ready:"+(name==null?"":name));  
	    }  
	

}
