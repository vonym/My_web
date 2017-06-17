<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <% request.setCharacterEncoding("utf-8");
 	String name=request.getParameter("name");
    String password=request.getParameter("password");
    String sex=request.getParameter("sex");
    String address=request.getParameter("address");
    String tel=request.getParameter("tel"); 
    if(null==name || null==password || null==sex || null==address || null==tel ||
		name.equals("")|| password.equals("")|| sex.equals("")|| address.equals("")|| tel.equals("")){%>
		<jsp:forward page="index.jsp"/>
	<%}else {%> 
	用户名： <%=name %> <br>
	密码：   <%=password %><br>
	性别：<%=sex %><br>
	地址：  <%=address %><br>
	手机号码：  <%=tel %> <br>
	<% } %>
</body>
</html>