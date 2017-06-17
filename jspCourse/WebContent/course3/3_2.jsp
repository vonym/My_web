<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jsp 注释</title>
</head>
<body>
<!--Java 代码  -->
<%String value="Hello World"; %>
<%-- Jsp 注释 --%>
<%//out.println(value);%>

<br/>
<%String username="admin"; 
	  /* if(username.equals("admin")){
		out.println(username);
		}  */ 
%>



</body>
</html>