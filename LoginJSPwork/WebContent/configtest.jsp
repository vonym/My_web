<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8");%>
用户名：<%=config.getInitParameter("name")%><br>
密码：<%=config.getInitParameter("password") %><br>
性别：<%=config.getInitParameter("sex") %><br>
地址：<%=config.getInitParameter("address") %><br>
电话：<%=config.getInitParameter("tel") %><br>
</body>
</html>