<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	margin-top: 30px;
}
</style>
</head>
<body>
<center>
		<form action="../do.jsp" method="post">
		<table border="1px" cellspacing="0" cellpadding="0">
			<thead>
				<th>学号</th>
				<th>姓名</th>
				<th>密码</th>
				<th>成绩</th>
				<th>更新人</th>
			</thead>
			<tr height="30px">
				<td><input type="text" name="userid" style="height:30px; font-size:16px"/></td>
				<td><input type="text" name="username" style="height:30px; font-size:16px"/></td>
				<td><input type="text" name="password" style="height:30px; font-size:16px"/></td>
				<td><input type="text" name="userscore" style="height:30px; font-size:16px"/></td>
				<td><input type="text" name="updateby" style="height:30px; font-size:16px"/></td>
			</tr>
		</table>
		<input type="submit" value="保存" name="adduser"/>
		<input type="reset" value="重置"/>
		</form>
	</center>
</body>
</html>