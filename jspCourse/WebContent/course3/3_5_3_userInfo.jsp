<%@ page contentType="text/html; charset=utf-8" language="java" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link type="text/css" rel="stylesheet" href="../css/style.css">
<title>显示用户注册结果</title>
</head>
<% request.setCharacterEncoding("utf-8"); %>

<jsp:useBean id="userInfo" class="com.bean.UserInfo" scope="request">
</jsp:useBean>
<jsp:setProperty name="userInfo" property="*"/>


<body>
<br>


<table width="307" height="206" border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="78A3D3">
  <tr>
    <td height="202" valign="top" bgcolor="#FFFFFF">
	<br>
	<font size="4pt">&nbsp;显&nbsp;示&nbsp;用&nbsp;户&nbsp;注&nbsp;册&nbsp;信&nbsp;息</font>
	<hr width="90%" color="#999999">
		<table width="244" border="0" align="center">
      <tr>
        <td height="30">账号：&nbsp;&nbsp;&nbsp;&nbsp;</td>
        <td height="30"><%=userInfo.getAccount()%></td>
      </tr>
      <tr>
        <td height="30">密码：&nbsp;&nbsp;&nbsp;&nbsp;</td>
        <td height="30">
        <%=userInfo.getPassword()%>
        <jsp:getProperty name="userInfo" property="password" />
       </td>
      </tr>
		
		      <tr>
        <td height="30">真实姓名：&nbsp;</td>
        <td height="30">
         <%=userInfo.getRealname()%>
        
        
        </td>
	      </tr>
		      <tr>
        <td height="30">Email地址：          </td>
        <td height="30">

         <%=userInfo.getEmail()%>
        </td>
	      </tr>
	        <tr>
        <td height="30">性别：          </td>
        <td height="30">
		<%=userInfo.getSex()%>
       </td>
          </tr>
    </table>
  客户端名称:<%=request.getRemoteAddr() %>

	</td>
  </tr>
</table>
</body>
</html>
