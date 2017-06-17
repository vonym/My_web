package com.briup.param;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
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
import javax.servlet.http.HttpSession;

import org.apache.catalina.mbeans.UserMBean;

@WebServlet("/servlet/registServlet")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("username");
		String password = req.getParameter("pwd");
		UserDao dao = new UserDaoImpl();
		User user = dao.findUserByName(name);
		if (user != null) {
			if (user.getPassword().equals(password)) {
				out.println("<html><body>登录成功</body></html>");
			} else {
				out.println("<html><body>用户名或密码不正确</body></html>");
			}
		}
		out.flush();
		resp.setContentType("image/jpeg;charset=utf-8");
		HttpSession session=req.getSession();
		User user2=(User) session.getAttribute("user");
		if (user2!=null) {
			File file=new File("");
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
			
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
