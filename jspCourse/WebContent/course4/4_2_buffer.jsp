<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" buffer="none" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../css/style.css" type="text/css" rel="stylesheet">

</head>
<body>
<%  %>
<table width="370" border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="#CCCCCC">
  <tr>
    <td width="131" height="30">缓冲区大小：</td>
    <td width="223" bgcolor="#FFFFFF"><%=response.getBufferSize()%></td>
  </tr>
  <tr>
    <td height="30" colspan="2" align="center">缓冲区设置之前</td>
  </tr>
  <tr>
    <td height="30">输出的内容是否提交：</td>
    <td bgcolor="#FFFFFF"><%=response.isCommitted()%></td>
  </tr>
  <tr>
    <td height="30" colspan="2" align="center">缓冲区设置之后<%response.flushBuffer();%></td>
  </tr>
  <tr>
    <td height="30">输出的内容是否提交：</td>
    <td bgcolor="#FFFFFF"><%=response.isCommitted()%></td>
  </tr>
</table>
</body>
</html>