<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext对象</title>
</head>
<body>
<%
//使用pageContext 设置属性，该属性默认在page 范围内  
pageContext.setAttribute ("page" , "hello") ;  

out.println(pageContext.getAttribute("page")+"<br>");
//使用request 设置属性，该属性默认在request 范围内  
request.setAttribute ("request" , "hello1req");  
  
//使用pageContext将属性设置在request 范围中  
pageContext.setAttribute("request2" , "hello1" , pageContext.REQUEST_SCOPE);  

out.println(request.getAttribute("request2"));
out.println(pageContext.getRequest().getAttribute("request")+"<br>");
  
//使用session将属性设置在session 范围中  
session.setAttribute("session" , "hello2");  
  
//使用pageContext将属性设置在session范围中  
pageContext.setAttribute("session2" , "hello2" , pageContext.SESSION_SCOPE);  

out.println(session.getAttribute("session2"));
out.println(pageContext.getSession().getAttribute("session2")); 

//使用application将属性设置在application范围中  
application.setAttribute ("app" , "hello3") ;  
  
//使用pageContext 将属性设置在application 范围中  
pageContext.setAttribute("app2" , "hello3" , pageContext.APPLICATION_SCOPE); 

out.println(application.getAttribute("app2"));
out.println(pageContext.getServletContext().getAttribute("app2")); 

pageContext.forward("4_6_otherPage.jsp");

%>

</body>
</html>