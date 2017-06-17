<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.db.DBConnection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="simpleBean" class="com.bean.SimpleBean"></jsp:useBean>
<%
String driver = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/jspCourse";
String user = "root"; 
String password = "root";

DBConnection dbConn = new DBConnection();
/* dbConn.setDriver(driver);
dbConn.setPassword(password);
dbConn.setUrl(url);
dbConn.setUser(user); */

if(dbConn.getDBConnection()!=null)
{
	out.println("连接成功");}	
%>
</body>
</html>