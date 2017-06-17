<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.StringWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ExceptionTest页面</title>
</head>
<body>
<h2>ExceptionTest页面</h2>
<hr>
<% StringWriter sout=new StringWriter();
	PrintWriter pout=new PrintWriter(sout);
	exception.printStackTrace(pout); 
%>
<%=sout.toString() %>
<!--response.sendError(500,"请求页面存在错误。"); -->
</body>
</html>