<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/mytag.tld" prefix="mytag"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>taglib 动作指令</title>
</head>
<body>
<% Integer i = 10; %>
<mytag:hello></mytag:hello>
<mytag:date></mytag:date>
<mytag:field field="Hello" count="<%=i%>"></mytag:field>
<mytag:inputText name="username" value=""></mytag:inputText>
</body>
</html>