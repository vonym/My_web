<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎</title>
<style type="text/css">
.fontstyle {
	font: bold 宋体;
}

body {
	margin: 20px;
}

#a {
	width: 240px;
	height: 400px;
	border: 2px solid;
	border-color: #000;
	float: left;
	margin-left: 20px;
	margin-right: 20px;
}

li {
	height: 40px;
}
</style>
</head>
<body>
	<center>
		<h3 class="fontstyle"><%=session.getAttribute("username")%>,欢迎你
		</h3>
	</center>
	<hr>
	<div id="a">
		<ul style="width: 100%; height: 100%">
			<li><a href="user.jsp" target="showinfo">首页</a></li>
			<li><a href="userinfo.jsp" target="showinfo">个人信息</a></li>
			<li><a href="updateuser.jsp" target="showinfo">编辑个人信息</a></li>
			<li><a href="../index.jsp" target="_top">退出</a></li>
		</ul>
	</div>
	<div style="border:1px solid;">
		<iframe src="user.jsp" name="showinfo" scrolling="no" width="1000px;" height="400px;"></iframe>
	</div>
	<div style="float: right; margin-bototom: 0px;">
		<img src="images/b.jpg" />
	</div>
</body>
</html>