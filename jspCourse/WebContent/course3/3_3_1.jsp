<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>声明语句</title>
</head>
<body>
<%! 
	int number = 0;
	void addNumber(){
		number++;
		}
	
	%>
	<% 
	this.addNumber();
	out.println("本网页的访问次数是:"+number);
%>

</body>
</html>