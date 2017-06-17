package com.servlet;

import java.io.IOException;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.bean.User;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet(name="login",urlPatterns={"/course6/login"},initParams = {
        @WebInitParam(name = "code", value = "3456")})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    //初始化
    public void init(ServletConfig config) throws ServletException{
    	
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
		// TODO Auto-generated method stubr
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setPassword(password);
		user.setUsername(username);
		
		
		boolean bool = user.login(user);
		System.out.println(bool);
		if(bool){
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			request.getRequestDispatcher("/course6/index.jsp").forward(request,response);
		}else{
			request.getRequestDispatcher("/course6/login.jsp").forward(request,response);
		}	
		
	}
	
	public void destroy(){
		super.destroy();
		System.out.println("destroy方法");
	}
}
