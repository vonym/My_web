<%@page import="java.sql.*"%>
<%@page import="connDB.ConnDBClass"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>个人信息</h3>
		<table>
			<%
				request.setCharacterEncoding("utf-8");
				ConnDBClass conn = new ConnDBClass();
				ResultSet set = conn
						.executQuery("select * from t_user where USERNAME='" + session.getAttribute("username") + "'");
				while (set.next()) {
			%>
			<tr>
				<td>学号：</td>
				<td><%=set.getInt(1)%></td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td><%=set.getString(2)%></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><%=set.getString(3)%></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td><%=set.getString(4)%></td>
			</tr>
			<tr>
				<td>出生年月：</td>
				<td><%=set.getString(5)%></td>
			</tr>
			<tr>
				<td>籍贯：</td>
				<td><%=set.getString(6)%></td>
			</tr>
			<%
				}
			%>
		</table>
	</center>
</body>
</html>