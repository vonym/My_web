<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="loginUser" class="com.po.User" scope="page" />
<jsp:useBean id="userdao" class="com.dao.UserDao" scope="page" />
<jsp:setProperty property="*" name="loginUser" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if (userdao.LoginDao(loginUser)) {
	%>
	用户名：<%=loginUser.getName()%><br> 密码：<%=loginUser.getPassword()%>
	<%
		} else {
			request.getRequestDispatcher("login_fail.jsp").forward(request, response);
		}
	%>
</body>
</html>