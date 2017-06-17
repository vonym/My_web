<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.SQLException,java.sql.DriverManager,com.mysql.jdbc.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.println(config.getServletName());
	//out.println(config.getServletContext().getRealPath("4_8_config.jsp"));
%>

<%   /* String driver = config.getInitParameter("driver1");
	String url = config.getInitParameter("url1");
	String user = config.getInitParameter("user1");
	String password = config.getInitParameter("password1");
	out.println(driver);
	 try{
		Class.forName(driver);
		Connection conn = (Connection) DriverManager.getConnection(url,user,password);	
	}catch(SQLException e){
		e.printStackTrace();
	}  */  
	 %>
</body>
</html>