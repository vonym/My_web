package com.briup.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<students>");
		out.println("<student id='1'>");
		out.println("<name>tom</name><age>20</age>");
		out.println("</student><student id='2'>");
		out.println("<name>jack</name><age>22</age>");
		out.println("</student></students>");
		out.flush();
		out.close();

	}
}
