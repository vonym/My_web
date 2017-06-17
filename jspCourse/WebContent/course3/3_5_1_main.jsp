<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp 动作元素 include</title>
</head>
<body>

<jsp:include page="3_5_1_head.jsp" flush="true" >
	<jsp:param value="admin" name="username"/>
</jsp:include>

<div style="height:400px;text-align:center">
<h1>Main 部分</h1>
</div>

<jsp:include page="3_5_1_footer.jsp" flush="true" />
<% response.sendRedirect("3_5_1_footer.jsp"); %>
</body>
</html>