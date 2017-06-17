<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="javax.servlet.http.Cookie,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	Cookie cookie_response=null;
	if(cookies!=null){
		cookie_response = cookies[0];
		System.out.println(cookie_response);
	}
	
	out.println("current time:"+ new Date() + "</br>");
	
	if(cookie_response!=null){
		out.println("last access time:" + cookie_response.getValue());
		cookie_response.setValue(new Date().toString());
	}
	
	if(cookies==null){
		cookie_response = new Cookie("accessTime","");
		cookie_response.setValue(new Date().toString());
		response.addCookie(cookie_response);
	}
%>
</body>
</html>