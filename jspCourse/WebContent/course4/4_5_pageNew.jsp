<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>page对象</title>
</head>
<body>
<%=page.toString()%>
<%=page.hashCode()%>
Hash值是文件内容通过二进制码进行一系列的变换生成出来的,即使文件名发生变化，</br>
Hash的值也不会发生改变。因此在开发的过程中一般比较两个文件是否相同都是去比较两个文件的Hash值。
</body>
</html>