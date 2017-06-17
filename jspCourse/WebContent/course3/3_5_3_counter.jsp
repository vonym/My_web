<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp usebean</title>
</head>
<body>
<!--初始化counter这个Bean，实例为counter -->
<jsp:useBean id="counter" scope="application" class="com.bean.Counter" /> 
<%//显示当前的属性count的值，也就是计数器的值，这里我们使用out.println方法，下面的counter1.jsp将使用另一种方法
out.println("The Counter is : " + counter.getCount() + "<BR>");
%>
The Counter is :  <jsp:getProperty name="counter" property="count" />
</body>
</html>