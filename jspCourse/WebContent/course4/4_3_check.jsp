<%@page import="com.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp forward</title>
</head>
<body>

<% 
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	User user = new User();
	user.setUsername(username);
	user.setPassword(password);
	
	boolean bool = user.login(user);
	
	if(bool){
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		response.sendRedirect("4_3_index.jsp" );
	}else{
		request.setAttribute("message", "用户名和密码不正确！");
		request.getRequestDispatcher("4_3_login.jsp").forward(request,response);
	}
	
	/* if(username.equals("admin")&&password.equals("123456")){
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		response.sendRedirect("4_3_index.jsp" );
		
	}else{
		request.setAttribute("message", "用户名和密码不正确！");
		request.getRequestDispatcher("4_3_login.jsp").forward(request,response);
	} */
	%>
</body>
</html>