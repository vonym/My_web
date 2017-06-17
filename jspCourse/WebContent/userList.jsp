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
	
	<a href="userAdd.jsp">增加</a> 
	<form method="post" action="UserAction?flag=search">
		用户名:<input type="text" name="username" /> &nbsp;&nbsp;&nbsp;&nbsp;
		性别：男<input type="radio" name="sex" value="true" />
			女<input type="radio" name="sex" value="false"  />
		<input type="submit" name="submit" value="搜索" />
	</form>
	<table border=1>
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>密码</th>
			<th>性别</th>
			<th>生日</th>
			<th>电话</th>
			<th>编辑</th>
			<th>删除</th>
		</tr>
		<% 
	Message message = null;
	List<User> userList = new ArrayList<User>();
	Iterator<User> it = null;
	
	if(request.getAttribute("message")!=null){
		message = (Message)request.getAttribute("message");
	}
	if(request.getAttribute("userList")!=null){
		userList = (ArrayList)request.getAttribute("userList");
		it = userList.iterator();
	}
	%>
		
		<% 
			while(it.hasNext()){
				User user = it.next();
				Integer userId = user.getUserId();
				String username = user.getUsername();
				String password = user.getPassword();
				String sex;
				if(user.isSex()){
					sex = "男";
				}else{
					sex = "女";
				}
				String birthday = user.getBirthday();
				String tel = user.getTel();
				%>
			<tr>
				<td><%=userId%></td>
				<td><%=username%></td>
				<td><%=password%></td>
				<td><%=sex%></td>
				<td><%=birthday%></td>
				<td><%=tel%></td>
				<td><a href="UserAction?flag=gotoUpdate&userId=<%=userId%>">编辑</a></td>
				<td><a href="UserAction?flag=delete&userId=<%=userId%>">删除</a></td>
			</tr>	
			<%}
		%>
	</table>
</body>
</html>