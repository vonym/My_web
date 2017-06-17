<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>root</title>
<style type="text/css">
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
		<h2>管理员界面</h2>
		<hr>
	</center>
	<div id="a">
		<ul style="width: 100%; height: 100%">
			<li><a href="root.jsp" target="showinfo">首页</a></li>
			<li><a href="insertscore.jsp" target="showinfo">插入学生成绩信息</a></li>
			<li><a href="updateuser.jsp" target="showinfo">修改学生信息</a></li>
			<li><a href="adduser.jsp" target="showinfo">增加学生信息</a></li>
			<li><a href="../index.jsp" target="_top">退出</a> 
			<%session.removeAttribute("username");%></li>
		</ul>
	</div>
	<iframe width="1000px" height="500px" scrolling="no" src="root.jsp"
		name="showinfo"></iframe>
</body>
</html>