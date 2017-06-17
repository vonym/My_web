<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>GET和POST方式</h2>
<a href="servlet/HelloServlet">GET方式</a><hr>

<h2>路径跳转</h2><br>
<h2>相对路径</h2>
<a href="servlet/RelaServlet">跳转到相对路径L1</a><br>

<a href="<%=request.getContextPath()%>/servlet/DireServlet">跳转到绝对路径L2</a><br>
</body>
</html>