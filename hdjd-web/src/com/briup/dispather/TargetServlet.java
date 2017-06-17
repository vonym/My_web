package com.briup.dispather;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/TargetServlet")
public class TargetServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		/*
		 * PrintWriter out = response.getWriter(); String reqValue = (String)
		 * request.getAttribute("requestCode"); int sessionValue = (int)
		 * request.getSession().getAttribute("sessionCode"); boolean
		 * applicationValue = (boolean)
		 * request.getSession().getServletContext().getAttribute(
		 * "applicationCode"); out.println("<html><body>");
		 * out.println("<h2>targetServlet from sourceServlet</h2>");
		 * out.println("<h2>reqValue:" + reqValue + "</h2>");
		 * out.println("<h2>sessionValue:" + sessionValue + "</h2>");
		 * out.println("<h2>applicationValue:" + applicationValue + "</h2>");
		 * out.println("</body></html>"); out.flush();
		 */

		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			String name = cookie.getName();
			String value = cookie.getValue();
			System.out.println(name + "=" + value);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
