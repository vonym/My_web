<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String username = request.getParameter("username");
	if(username!=null && !username.trim().equals("")){
		Cookie cookie = new Cookie("username",username);
		cookie.setMaxAge(30);
		response.addCookie(cookie);
	}else{
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie:cookies){
			String cookieName = cookie.getName();
			if("username".equals(cookieName)){
				String value = cookie.getValue();
				username = value;
			}
		}
	}
	
	if(username!=null && !username.trim().equals("")){
		out.println("Hello:" + username);
	}else{
		response.sendRedirect("4_1_login.jsp");
	}
%>
</body>
</html>