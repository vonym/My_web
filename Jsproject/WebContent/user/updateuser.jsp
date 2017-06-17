<%@page import="java.sql.*"%>
<%@page import="connDB.ConnDBClass"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>updateuser</title>
</head>
<body style="margin:20px;">
	<center>
		<form action="../do.jsp" method="post">
			<table>
				<%
					request.setCharacterEncoding("utf-8");
					ConnDBClass conn = new ConnDBClass();
					ResultSet set = conn.executQuery("select t_user.USER_ID from t_user,t_root where t_user.USERNAME='"
							+ session.getAttribute("username") + "' and t_user.USER_ID=t_root.USER_ID");
					try {
						while (set.next()) {
				%>
				<tr>
					<td>学号：</td>
					<td><%=set.getInt(1)%></td>
					<%
						session.setAttribute("userid", set.getInt(1));
					%>
				</tr>
				<tr>
					<td>姓名：</td>
					<td><input type="text"
						value="<%=session.getAttribute("username")%>" name="username" /></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>确认密码：</td>
					<td><input type="password" name="password1" /></td>
				</tr>
				<tr>
					<td>性别：</td>
					<td><input type="text" name="usersex" /></td>
				</tr>
				<tr>
					<td>出生年月：</td>
					<td><input type="text" name="userbirthday" /></td>
				</tr>
				<tr>
					<td>籍贯：</td>
					<td><input type="text" name="useraddress" /></td>
				</tr>
				<%
					}
					} catch (Exception e) {
					}
				%>
			</table>
			<input type="submit" name="userinfo" value="保存" /> <input
				type="reset" value="重置" />
		</form>
	</center>
</body>
</html>