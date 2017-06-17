<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册界面</title>
<script type="text/javascript">
	function check() {
		var userid = document.getElementById("userid").value;
		var username = document.getElementById("username").value;
		var password = document.getElementById("password").value;
		var password1 = document.getElementById("password1").value;
		var usersex = document.getElementById("usersex").value;
		var userbirthday = document.getElementById("userbirthday").value;
		var useraddress = document.getElementById("useraddress").value;
		if (userid == "" || username == "" || password == "" || password1 == ""
				|| usersex == "" || userbirthday == "" || useraddress == "") {
			alert("所有为必填项！");
			return false;
		} else {
			if (password == password1) {
				return true;
			} else {
				alert("密码不一致！");
				return false;
			}
		}
	}
</script>
</head>
<body>
	<center>
		<h3>注册界面</h3>
		<br>
		<form method="post" action="../do.jsp" onsubmit="return check()">
			<table>
				<tr>
					<td>学号：</td>
					<td><input type="text" name="userid" id="userid" /></td>
				</tr>
				<tr>
					<td>姓名：</td>
					<td><input type="text" name="username" id="username" /></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="password" id="password" /></td>
				</tr>
				<tr>
					<td>确认密码：</td>
					<td><input type="password" name="password1" id="password1" /></td>
				</tr>
				<tr>
					<td>性别：</td>
					<td><input type="text" name="usersex" id="usersex" /></td>
				</tr>
				<tr>
					<td>出生年月：</td>
					<td><input type="text" name="userbirthday" id="userbirthday" /></td>
				</tr>
				<tr>
					<td>籍贯：</td>
					<td><input type="text" name="useraddress" id="useraddress" /></td>
				</tr>
			</table>
			<input type="submit" value="提交" name="submit" /><input type="reset"
				value="重置" />
		</form>
	</center>
</body>
</html>