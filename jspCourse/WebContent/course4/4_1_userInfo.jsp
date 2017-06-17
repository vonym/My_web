<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table width="307" height="206" border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="78A3D3">
  <tr>
    <td height="202" valign="top" bgcolor="#FFFFFF">
	<br>
	<font size="4pt">&nbsp;&nbsp;显示用户注册信息</font>
	<hr width="90%" color="#999999">

	<table width="244" border="0" align="center">
      <tr>
        <td width="83" height="30">账号：&nbsp;&nbsp;&nbsp;&nbsp;</td>
        <td width="151" height="30"><%=request.getAttribute("account")%></td>
      </tr>
      <tr>
        <td height="30">密码：&nbsp;&nbsp;&nbsp;&nbsp;</td>
        <td height="30"><%=request.getAttribute("password")%></td>
      </tr>
		<tr>
        <td height="30">真实姓名：&nbsp;</td>
        <td height="30"><%=request.getAttribute("realname")%></td>
	      </tr>
		      <tr>
        <td height="30">Email地址：          </td>
        <td height="30"><%=request.getAttribute("email")%></td>
	      </tr>
	      <tr>
        <td height="30">性别：     </td>
        <td height="30">
        <%=request.getAttribute("sex")%>
        </td>
          </tr>   
          <tr>
        <td height="30">兴趣：     </td>
        <td height="30">
        <%
       
        String[] intresting = (String[])request.getAttribute("intresting");	
        
         for(int i=0;i<intresting.length;i++){
        		out.println(intresting[i]+"&nbsp;");
        	} 
         
        %>
        </td>
          </tr>   
            <tr>
        <td height="30">籍贯：     </td>
        <td height="30">
        <%=request.getAttribute("hometown")%>
        </td>
          </tr>             
    </table>
	
	
	</td>
  </tr>
</table>

 <% 
    response.sendRedirect("4_1_test.jsp");
 /* request.getRequestDispatcher
 ("4_1_test.jsp").forward(request, response); */
%> 
<%--  <jsp:forward page="4_1_test.jsp"></jsp:forward> 
 --%></body>
</html>