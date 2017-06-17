package com.jspCourse.action;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jspCourse.entity.Message;
import com.jspCourse.entity.User;
import com.jspCourse.service.UserService;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserService userService = new UserService(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAction() {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		boolean bool = userService.checkLogin(user);
		
		if(bool){
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			request.getRequestDispatcher("navList.jsp").forward(request, response);
		}else{
			Message message= new Message();
			message.setResult("failed");
			message.setMessageInfo("用户名或密码错误");
			request.setAttribute("message", message);
			request.getRequestDispatcher("login.jsp").forward(request, response);

		}
	}

}
