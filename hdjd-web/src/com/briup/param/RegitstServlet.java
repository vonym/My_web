package com.briup.param;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/registServlet")
public class RegitstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String name = req.getParameter("username");
		String password = req.getParameter("pwd");
		// PrintWriter out = resp.getWriter();
		// if ("tom".equals(name) && "123".equals(password)) {
		// out.println("<html><body><h1>");
		// out.println(name + "��¼�ɹ�!</h1></body></html>");
		// } else {
		// out.println("<html><body><h1>");
		// out.println("��¼ʧ��!</h1></body></html>");
		// }
		// out.flush();
		// out.close();
		String gender = req.getParameter("gender");
		// int age = Integer.parseInt(req.getParameter("age"));
		String str[] = req.getParameterValues("hobby");
		// Enumeration<String> enu = req.getParameterNames();
		// while (enu.hasMoreElements()) {
		// String s = enu.nextElement();
		// System.out.println(s);
		// }
		// Map<String, String[]> map=req.getParameterMap();
		// Set<String> set=map.keySet();
		// for (String s : set) {
		// System.out.println(s);
		// }
		System.out.println("name:" + name + "  password:" + password + "  gender:" + gender);
		String hobby = str[0];
		for (int i = 0; i < str.length; i++) {
			hobby += "," + str[i];
		}
		System.out.println("hobby:" + hobby);
		User user = new User(name, password, gender, hobby);
		// ע����Ҫ�ж��û��Ƿ����
		UserDao dao = new UserDaoImpl();
		PrintWriter writer = resp.getWriter();
		User u = dao.findUserByName(name);
		if (u == null) {
			// dao.saveUser(user);
			// writer.println("<html><body><h1>ע��ɹ�</h1></body></html>");
		} else {
			//�ض���ľ���·����Tomcat��·��
			resp.sendRedirect("/login.html");
			//req.getRequestDispatcher("/login.html").forward(req, resp);
			//req.getServletContext().getRequestDispatcher("/login.html").forward(req, resp);
			// writer.println("<html><body><h1>ע��ʧ�ܣ��û��Ѵ���</h1></body></html>");
		}
	}
}
