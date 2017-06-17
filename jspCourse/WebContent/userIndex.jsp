<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.bean.UserList"%>
<%@ page import="java.util.Vector" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%  
        //如果未登录，转向登录页面  
        if(session.getAttribute("userName")==null){  
            response.sendRedirect("userLogin.jsp");  
        }  
        Vector onlineUsers=UserList.getVector();   
    %>  
    <h2>登录成功</h2>  
    欢迎你 <span style="color:red;">  
    <%=session.getAttribute("userName") %>  
    </span>       
    <a href="exitDo">退出登录</a>  
  
    当前在线人数：<span style="color:red;">  
        <%=UserList.getUserCount() %>人</span>  
    <br/><br>  
    在线用户名单 :  
    <br/>   
    <select multiple="multiple" name="list"  
        style="width:200px;height:250px">  
    <%     
        for(int i=0;i<onlineUsers.size();i++){  
            out.write("<option>"+onlineUsers.get(i)+"</option>");  
        }  
    %>  
    </select> 
</body>
</html>