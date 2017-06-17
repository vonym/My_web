<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
</head>
<body>
	<form action="configtest.jsp" method="post">
			用户名： <input type="text" name="name" /> <br>
			密码： <input type="password" name="password" /> <br>
			确认密码： <input type="password" name="password" /> <br>
			性别： 男 <input type="radio" checked="checked" name="sex" value="man"/> 
				      女 <input type="radio" name="sex" value="woman"/> <br>
			地址：<input type="text" name="address" /> <br>
			手机号码： <input type="text" name="tel" /> <br>
			<input type="submit" name="submit" /> <input type="reset" name="reset" />
	</form>
</body>
</html>