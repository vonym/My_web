<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.jspCourse.entity.Message" %>
<%@ page import="com.jspCourse.entity.User" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	User user = (User)request.getAttribute("user");
	Integer userId = user.getUserId();
	String username = user.getUsername();
	String password = user.getPassword();

	boolean sex = user.isSex();
	
	String birthday = user.getBirthday();
	String tel = user.getTel();

%>
<form method="post" action="UserAction?flag=update">
	序号：<input type="text" name="userId" value="<%=userId %>" /><br>
	用户名：<input type="text" name="username" value="<%=username%>"/><br>
	密码：<input type="password" name="password" value="<%=password%>"/><br>
	性别：<% if(sex){ %>
	男<input type="radio" name="sex" value="true" checked />
	女<input type="radio" name="sex" value="false"  /><br>
	<%}else{ %>
	男<input type="radio" name="sex" value="true"  />
	女<input type="radio" name="sex" value="false" checked /><br>
	<%} %>
	
	生日：<input type="text" name="birthday" value="<%=birthday%>" /><br>
	电话：<input type="text" name="tel" value="<%=tel%>"/><br>
	<input type="submit" name="submit" value="提交"/>
</form> 
<%
	 
%>
</body>
</html>