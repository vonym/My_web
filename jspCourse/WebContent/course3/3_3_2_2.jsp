<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jsp 脚本段</title>
</head>
<body>
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	if(username.equals("admin")&&password.equals("123456")){
		%>
		<p>欢迎管理员<b><%=username%></b>登录</p>
		<script>
		var username = "<%=username%>";
		alert(username);
		</script>
		<% 
	}else{%>
		<p>您输入的用户名和密码错误，请重新输入！</p>
	<% 	
	}
%>

</body>
</html>