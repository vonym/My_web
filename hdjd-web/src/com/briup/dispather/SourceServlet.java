package com.briup.dispather;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet/sourceServlet")
public class SourceServlet extends HttpServlet {
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		/*
		 * req.setAttribute("requestCode", "request"); HttpSession session =
		 * req.getSession(); session.setAttribute("sessionCode", 10);
		 * ServletContext context = req.getSession().getServletContext();
		 * context.setAttribute("applicationCode", true);
		 */

		/*
		 * String name=req.getParameter("name");
		 * System.out.println("SourceServlet:"+name); PrintWriter out =
		 * resp.getWriter(); out.println("<html><body>");
		 * out.println("<h2>sourceServlet to targetServlet</h2>");
		 * out.println("</body></html>");
		 */

		/**
		 * forward(request,response)会清空response里边的信息.相对比较常用。
		 * include(request,response)不会清空。而是将要跳转到的资源的信息包含到当前response里边
		 */
		// req.getRequestDispatcher("/servlet/targetServlet").include(req,resp);

		Cookie c1 = new Cookie("name", "tom");
		Cookie c2 = new Cookie("password", "123");
		c1.setMaxAge(60);
		resp.addCookie(c1);
		resp.addCookie(c2);

		resp.sendRedirect("targetServlet");

		// out.flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
