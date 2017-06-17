<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎</title>
<script type="text/javascript">
	function check() {
		var login = document.getElementById("login").name;
		var regist = document.getElementById("regist").name;
		var username = document.getElementById("username").value;
		var password = document.getElementById("password").value;
		if ("regist" == regist) {
			return true;
		} else if ("login" == login) {
			if (username == "" || password == "") {
				alert("用户名或密码不能为空！");
				return false;
			} else
				return true;
		}
	}
</script>
<style type="text/css">
body {
	background: url(images/a.jpg);
	background-attachment: fixed;
	background-repeat: repeat;
	background-position: center;
}

#Font {
	font: bold 宋体;
}

.btn {
	border: 0px;
	width: 90px;
	height: 30px;
	background: #6495ED;
	border-radius: 8px;
	margin-top: 20px;
}

.textstyle {
	border: 0;
	border-bottom: 1px solid #000;
	background: transparent;
}
</style>
</head>
<body>
	<div
		style="float: right; margin-top: 150px; margin-right: 40px; width: 250px; height: 240px;">
		<center>
			<h2 id="Font">欢迎界面</h2>
			<form action="do.jsp" method="post" onsubmit="return check()">
				<table>
					<tr>
						<td id="Font">姓名：</td>
						<td><input type="text" name="username" id="username"
							class="textstyle" /></td>
					</tr>
					<tr>
						<td id="Font">密码：</td>
						<td><input type="password" name="password" id="password"
							class="textstyle" /></td>
					</tr>
				</table>
				<input type="submit" value="注册" name="regist" id="regist"
					class="btn" />&nbsp;&nbsp; <input type="submit" value="登录"
					name="login" id="login" class="btn" />
			</form>
		</center>
	</div>
</body>
</html>