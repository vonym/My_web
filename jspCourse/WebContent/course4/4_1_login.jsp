<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp forward</title>
</head>
<body>
<form action="4_1_index.jsp" method="post">
<fieldset style="width:300px;margin:0 auto">
<legend>登录</legend>
用户名:<input type="text" id="username" name="username" value="" /><br>
<br>
密&nbsp;码:<input type="password" id="password" name="password" value="" /><br>
<br>
<center>

<input type="submit" name="submit" value="提交">
<input type="reset" name="reset" value="重置">
</center>
</fieldset>
</form>
</body>
</html>