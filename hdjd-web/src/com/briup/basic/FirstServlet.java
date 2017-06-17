package com.briup.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("destory");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("FirstServlet----->init");
		Enumeration<String> enu = config.getInitParameterNames();
		while (enu.hasMoreElements()) {
			String name = enu.nextElement();
			String value = config.getInitParameter(name);
			System.out.println(name + "     " + value);
		}
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("this is firstServlet service∑Ω∑®");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>≤‚ ‘</title></head>");
		double radom = Math.random();
		out.println("<body><font size='6'><b>" + radom + "</b></body></html>");
		out.flush();
		out.close();
	}

}
