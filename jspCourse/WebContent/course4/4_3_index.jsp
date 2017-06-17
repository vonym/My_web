<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	Object obj = session.getAttribute("username");
	
	
%>
<body>
<%
	if(obj==null){
		request.setAttribute("message", "请输入用户名和密码！");
		request.getRequestDispatcher("4_3_login.jsp").forward(request,response);
	}else{
		out.println("欢迎"+obj.toString()+"登录");
	}
	//session.removeAttribute("username");
	//session.invalidate();
	out.println(session.getLastAccessedTime()+"<br/>");
	
	//session.setMaxInactiveInterval(1);
	out.println(session.getMaxInactiveInterval());
%>
</body>
</html>