<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="connDB.ConnDBClass"%>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{margin-top:30px;}
</style>
</head>
<body>
<center>
<%
	ConnDBClass conn=new ConnDBClass();
	ResultSet set= conn.executQuery("select t_user.USER_ID,t_user.USERNAME,USERSCORE,UPDATE_TIME from t_user,t_root where t_user.USER_ID=t_root.USER_ID");
%>
	<table border="1px" cellspacing="0" >
		<thead>
			<th>学号</th>
			<th>姓名</th>
			<th>成绩</th>
			<th>更新时间</th>
			<th>操作</th>
		</thead>
		<%while(set.next()) {%>
		<tr height="50px">
			<td width="50px"><%=set.getInt(1) %></td>
			<td width="50px"><%=set.getString(2) %></td>
			<td width="50px"><%=set.getString(3) %></td>
			<td width="180px"><%=set.getString(4) %></td>
			<%int id=set.getInt(1); %>
			<td width="50px"><a href="http://localhost:8080/Jsproject/doServlet?id=<%=id%>">删除</a></td>
		</tr>
		<%} %>
	</table>
</center>
</body>
</html>