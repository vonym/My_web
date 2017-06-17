<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:directive.page import="connDB.ConnDBClass"/>
<%	ConnDBClass connDBClass=new ConnDBClass();
	String sql_query="select * from studentinfo";
	ResultSet resultSet=connDBClass.executQuery(sql_query); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px">
	<caption>学生信息表</caption>
	<thead>
		<th>编号</th>
		<th>姓名</th>
		<th>学号</th>
		<th>性别</th>
		<th>家庭地址</th>
		<th>手机号码</th>
	</thead>
	<% 
	try{
		int countID=1;
	while(resultSet.next()){ %>
		<tr>
			<td id="ID"><%=countID %></td>
			<td><%=resultSet.getString(2) %></td>
			<td><%=resultSet.getString(3) %></td><td><%=resultSet.getString(4) %></td>
			<td><%=resultSet.getString(5) %></td><td><%=resultSet.getString(6) %></td>
		</tr>
	<% countID++;}}catch(Exception e){}finally{connDBClass.closeConnetion();}%>
	</table>
	<hr>
	<form action="do.jsp" method="post">
		<table border="1px">
			<thead>
				<th>编号</th>
				<th>姓名</th>
				<th>学号</th>
				<th>性别</th>
				<th>家庭地址</th>
				<th>手机号码</th>
			</thead>
			<tr>
				<td><input type="text" name="ID"/></td><td><input type="text" name="name"/></td>
				<td><input type="text" name="studentID"/></td><td><input type="text" name="sex"/></td>
				<td><input type="text" name="address"/></td><td><input type="text" name="tel"/></td>
			</tr>
			<table>
				<tr>
					<td><input type="submit" value="增加" name="insert" /></td>
				</tr>
			</table>
		</table>
	</form>
	<table>
		<tr>
			<td><input type="button" value="修改" name="update" onclick="window.location.reload('/DatabaseTest/do.jsp')"/></td>
			<td><input type="button" value="删除" name="del" onclick="window.location.reload('/DatabaseTest/do.jsp')"/></td>
		</tr>
	</table>
</body>
</html>