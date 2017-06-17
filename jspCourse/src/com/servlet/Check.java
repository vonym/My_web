package com.servlet;

import java.io.IOException;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.websocket.Session;

import org.apache.catalina.deploy.LoginConfig;

import com.bean.User;

/**
 * Servlet implementation class Check
 */
@WebServlet(name="check",urlPatterns={"/check","/check1"},initParams = {
        @WebInitParam(name = "checkcode", value = "3456")})

public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /*
     * @see HttpServlet#HttpServlet()
     */
    public Check() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		//response.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		boolean bool = user.login(user);
		
		if(bool){
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			request.getRequestDispatcher("course6/6_1_index.jsp").forward(request, response);
		}else{
			response.sendRedirect("course6/6_1_login.jsp");
		}
		
		/*String checkcode = getInitParameter("checkcode");
		String servletName = getServletName();
		
		
		System.out.println("checkcode:"+ checkcode);
		System.out.println("servletName:"+servletName);
		*/
	}

}
