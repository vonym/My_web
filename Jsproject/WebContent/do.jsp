<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.*"%>
<%@page import="connDB.ConnDBClass"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		ConnDBClass conn = new ConnDBClass();
		int userid;
		String username;
		String password;
		String usersex;
		String userbirthday;
		String useraddress;
		int userscore;
		String updateby;
		if ("登录".equals(request.getParameter("login"))) {
			System.out.print("登录");
			username = request.getParameter("username");
			password = request.getParameter("password");
			ResultSet setName = conn.executQuery("select USERNAME from t_user");
			ResultSet setpsw = conn.executQuery("select PASSWORD from t_user where USERNAME='" + username + "'");
			if ("root".equals(username) && "123".equals(password)) {
				response.sendRedirect("root/box.jsp");
			} else {
				while (setName.next()) {
					if (username.equals(setName.getString(1))) {
						while (setpsw.next()) {
							if (password.equals(setpsw.getString(1))) {
								session.setAttribute("username", username);
								response.sendRedirect("user/box.jsp");
							} else {
								out.print("<script>alert('密码错误！');window.location.href='index.jsp' </script>");
							}
						}
					} else {
						out.print("<script>alert('用户不存在！');window.location.href='index.jsp' </script>");
					}
				}
			}
		} else if ("注册".equals(request.getParameter("regist"))) {
			response.sendRedirect("user/regist.jsp");
		} else if ("提交".equals(request.getParameter("submit"))) {
			userid = Integer.parseInt(request.getParameter("userid"));
			username = request.getParameter("username");
			password = request.getParameter("password");
			usersex = request.getParameter("usersex");
			userbirthday = request.getParameter("userbirthday");
			useraddress = request.getParameter("useraddress");
			conn.executInsert("insert into t_user values(" + userid + ",'" + username + "','" + password + "','"
					+ usersex + "','" + userbirthday + "','" + useraddress + "')");
			conn.executInsert("insert into t_root(USER_ID,USERNAME) values(" + userid + ",'" + username + "')");
			out.print("<script>alert('注册成功！');window.location.href='regitst.jsp' </script>");
			response.sendRedirect("index.jsp");
		} else if ("保存".equals(request.getParameter("insertscore"))) {
			userid = Integer.parseInt(request.getParameter("userid"));
			username = request.getParameter("username");
			userscore = Integer.parseInt(request.getParameter("userscore"));
			updateby = request.getParameter("updateby");
			SimpleDateFormat updatetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			conn.executUpdate("update t_root set USERSCORE=" + userscore + ", UPDATE_TIME='"
					+ updatetime.format(date) + "',UPDATE_BY='" + updateby + "' where USER_ID=" + userid + "");
			out.print("<script>alert('保存成绩成功！');window.location.href='root/root.jsp' </script>");
		} else if ("保存".equals(request.getParameter("updateuser"))) {
			userid = Integer.parseInt(request.getParameter("userid"));
			username = request.getParameter("username");
			userscore = Integer.parseInt(request.getParameter("userscore"));
			updateby = request.getParameter("updateby");
			SimpleDateFormat updatetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			conn.executUpdate("update t_root set USERSCORE=" + userscore + ",UPDATE_TIME='"
					+ updatetime.format(date) + "',UPDATE_BY='" + updateby + "' where USER_ID=" + userid + "");
			out.print("<script>alert('更改成绩成功！');window.location.href='root/root.jsp' </script>");
		} else if ("保存".equals(request.getParameter("adduser"))) {
			userid = Integer.parseInt(request.getParameter("userid"));
			username = request.getParameter("username");
			password = request.getParameter("password");
			userscore = Integer.parseInt(request.getParameter("userscore"));
			updateby = request.getParameter("updateby");
			SimpleDateFormat updatetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			conn.executInsert("insert into t_root values(" + userid + ",'" + username + "'," + userscore + ",'"
					+ updatetime.format(date) + "','" + updateby + "')");
			conn.executInsert("insert into t_user(USER_ID,USERNAME,PASSWORD) values(" + userid + ",'" + username
					+ "','" + password + "')");
			out.print("<script>alert('添加学生信息成功！');window.location.href='root/root.jsp' </script>");
		}else if("保存".equals(request.getParameter("userinfo"))){
			username = request.getParameter("username");
			password = request.getParameter("password");
			usersex = request.getParameter("usersex");
			userbirthday = request.getParameter("userbirthday");
			useraddress = request.getParameter("useraddress");
			conn.executUpdate("update t_user set USERNAME='"+username+"',PASSWORD='"+password+"',USERSEX='"+usersex+"',USERBIRTHDAY='"+userbirthday+"',USERADDRESS='"+useraddress+"' where USER_ID="+session.getAttribute("userid")+"");
			conn.executUpdate("update t_root set USERNAME='"+username+"' where USER_ID="+session.getAttribute("userid")+"");
			out.print("<script>alert('更改信息成功！');window.location.href='user/user.jsp' </script>");
		}
	%>
</body>
</html>