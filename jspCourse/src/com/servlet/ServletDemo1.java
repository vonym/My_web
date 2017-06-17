package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ServletDemo1
 */
@WebServlet("/ServletDemo1")
public class ServletDemo1 extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ServletDemo1() {
        super();
        System.out.println("构造函数");
        // TODO Auto-generated constructor stub
    }
    
    //初始化
    public void init(ServletConfig config) throws ServletException{
    	super.init(config);
    	System.out.println("init方法");
    }
	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
    //处理用户请求
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("执行service方法");
		response.setCharacterEncoding("GBK");
		PrintWriter out = response.getWriter();
		out.println("<html>");
        out.println("<h2>这是第一个Servlet的例子</h2>"); 
        out.println("</html>"); 
        out.close();//关闭输出对象	
	}
	
	public void destroy(){
		super.destroy();
		System.out.println("destroy方法");
	}

}
