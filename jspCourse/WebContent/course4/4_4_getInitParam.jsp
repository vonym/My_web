<%@page import="java.sql.SQLException,java.sql.DriverManager,com.mysql.jdbc.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String driver = application.getInitParameter("driver");
	String url = application.getInitParameter("url");
	String user = application.getInitParameter("user");
	String password = application.getInitParameter("password");
	
	out.println(driver);
	 try{
		Class.forName(driver);
		Connection conn = (Connection) DriverManager.getConnection(url,user,password);	
		if(conn!=null){
			out.println("数据库连接成功！");
		}else{
			out.println("数据库连接失败！");
		}
	 }catch(SQLException e){
		e.printStackTrace();
	} 
%>
</body>
</html>