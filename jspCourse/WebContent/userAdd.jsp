<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="UserAction?flag=create">
	用户名：<input type="text" name="username" value=""/><br>
	密码：<input type="password" name="password" value=""/><br>
	性别：
	男<input type="radio" name="sex" value="true" />
	女<input type="radio" name="sex" value="false"  /><br>
	生日：<input type="text" name="birthday" /><br>
	电话：<input type="text" name="tel" /><br>
	<input type="submit" name="submit" value="提交"/>
</form> 
</body>
</html>