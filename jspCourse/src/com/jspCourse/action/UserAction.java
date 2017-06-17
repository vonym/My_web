package com.jspCourse.action;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspCourse.entity.Message;
import com.jspCourse.entity.User;
import com.jspCourse.service.UserService;

/**
 * Servlet implementation class RegisterAction
 */
@WebServlet("/UserAction")
public class UserAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private UserService userService = new UserService();
	
	private static String SUCCESS = "success";
	private static String FAILURE = "failure";
	
	private Integer userId;
	private String username;
	private String password;
	private boolean sex;
	private String birthday;
	private String tel;
	private boolean bool;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String flag = request.getParameter("flag");
		
		Message message = new Message();
		
		User user = new User();
		
		List<User> userList = new ArrayList<User>();
		switch (flag) {
			case "create":
				username = request.getParameter("username");
				password = request.getParameter("password");
				sex = Boolean.parseBoolean(request.getParameter("sex"));
				birthday = request.getParameter("birthday");
				tel = request.getParameter("tel");
				
				user.setUsername(username);
				user.setPassword(password);
				user.setSex(sex);
				user.setBirthday(birthday);
				user.setTel(tel);
				
				bool = userService.addUser(user);
				if(bool){
					message.setResult(SUCCESS);
					message.setMessageInfo("保存成功");
					request.setAttribute("message", message);
					request.getRequestDispatcher("UserAction?flag=read").forward(request, response);
				}else{
					message.setResult(FAILURE);
					message.setMessageInfo("保存失败");
					request.setAttribute("message", message);
					request.getRequestDispatcher("UserAction?flag=read").forward(request, response);
				}
				break;
			case "read":
				userList = userService.getAllUserList();
				if(userList.size()>0){
				
					request.setAttribute("userList", userList);
					request.getRequestDispatcher("userList.jsp").forward(request, response);
				}
				break;
			case "update":
				userId = Integer.parseInt(request.getParameter("userId"));
				username = request.getParameter("username");
				password = request.getParameter("password");
				sex = Boolean.parseBoolean(request.getParameter("sex"));
				birthday = request.getParameter("birthday");
				tel = request.getParameter("tel");
				
				user.setUserId(userId);
				user.setUsername(username);
				user.setPassword(password);
				user.setSex(sex);
				user.setBirthday(birthday);
				user.setTel(tel);

				bool = userService.updateUser(user);
			
				if(bool){
					message.setResult(SUCCESS);
					message.setMessageInfo("修改成功");
					request.setAttribute("message", message);
					request.getRequestDispatcher("UserAction?flag=read").forward(request, response);
				}else{
					message.setResult(FAILURE);
					message.setMessageInfo("修改失败");
					request.setAttribute("message", message);
					request.getRequestDispatcher("UserAction?flag=read").forward(request, response);
				}
				break;
			case "gotoUpdate":
				userId = Integer.parseInt(request.getParameter("userId"));
				user = userService.getUserById(userId);

				request.setAttribute("user", user);
				request.getRequestDispatcher("userUpdate.jsp").forward(request, response);
				
				break;
			case "delete":
				userId = Integer.parseInt(request.getParameter("userId"));
				bool = userService.deleteUser(userId);
				if(bool){
					message.setResult(SUCCESS);
					message.setMessageInfo("删除成功");
					request.setAttribute("message", message);
					request.getRequestDispatcher("UserAction?flag=read").forward(request, response);
				}else{
					message.setResult(FAILURE);
					message.setMessageInfo("删除失败");
					request.setAttribute("message", message);
					request.getRequestDispatcher("UserAction?flag=read").forward(request, response);
				}
				break;
			case "search":
				
				if(request.getParameter("username")!=null){
					username = request.getParameter("username");
					user.setUsername(username);
				}
				if(request.getParameter("sex")!=null){	
					sex =  Boolean.parseBoolean(request.getParameter("sex"));
					user.setSex(sex);
				}
				userList = userService.getUserListByParam(user);
				if(userList.size()>0){
					request.setAttribute("userList", userList);
					request.getRequestDispatcher("userList.jsp").forward(request, response);
				}
				break;
			default:
				break;
		}
	}

}
