<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
<!--
body {
	background-color: #99FFCC;
}
body,td,th {
	font-size: 18px;
}
.STYLE1 {
	font-size: 16;
	font-weight: bold;
}
-->
</style>
<body>
<p align="center">
<jsp:useBean id="circleBean" scope="session" class="com.bean.Circle"/></p>
<p align="center" class="STYLE1">
  
  <%
  	int radius=Integer.parseInt(request.getParameter("radius"));
	circleBean.setRadius(radius);
	%>

<table width="379" border="0" align="center" cellspacing="0">
  <tr>
        <td width="124" height="29"><span class="STYLE1">圆的半径是：</span></td>
  <td width="251">
        <%out.println(circleBean.getRadius());%>
    </td>
  </tr>
      <tr>
        <td height="32"><span class="STYLE1">圆的周长是：</span></td>
        <td>
          <%out.println(circleBean.circleLength());%>
       </td>
      </tr>
      <tr>
        <td height="35"><span class="STYLE1">圆的面积是：</span></td>
        <td>
          <%out.println(circleBean.circleArea());%>
   </td>
      </tr>
</table>
<p>&nbsp;</p>
</body>
</html>