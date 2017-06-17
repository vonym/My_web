<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp forward</title>
</head>
<body>

<% 
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	if(username.equals("admin")&&password.equals("123456")){
		%>
		<jsp:forward page="3_5_2_success.jsp">
			<jsp:param value="<%=username%>" name="username"/>
		</jsp:forward>
		<% 
	}else{%>
		<jsp:forward page="3_5_2_error.jsp" />
		
	<% 	
	}
	%>
</body>
</html>