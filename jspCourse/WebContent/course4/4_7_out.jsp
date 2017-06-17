<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>out对象</title>
</head>
<body>
<%
	out.println("缓冲操作开始：");
	out.clearBuffer();
	out.println("操作1:");
	out.flush();
	out.println("缓冲区空间："+ out.getBufferSize());
	out.println("剩余空间："+ out.getRemaining());
	out.println("AutoFlush状态："+out.isAutoFlush());
	out.close();
	out.print("Hello");
%>
</body>
</html>