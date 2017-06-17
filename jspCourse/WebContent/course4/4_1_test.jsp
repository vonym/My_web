<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%=request.getAttribute("hometown")%><br/>
<%=request.getParameter("hometown")%><br/> --%>
<%=request.getProtocol()%> request.getProtocol():获取请求使用的通信协议，如http/1.1等 <br/>
<%=request.getServletPath()%>getServletPath():获取请求的JSP也面所在的目录。 <br/>
<%=request.getContentLength()%>getContentLength():获取HTTP请求的长度。<br/> 
<%-- <%=request.getMethod()%>getMethod():获取表单提交信息的方式，如POST或者GET。 <br/>
 --%>
<%=request.getHeader("user-agent")%>getHeader(user-agent):获取请求中头的值。一般来说，S参数可取的头名有accept,referrer、accept-language、content-type、accept-encoding、user-agent、host、cookie等，比如，S取值user-agent将获得用户的浏览器的版本号等信息。<br/> 
<%=request.getHeaderNames()%>getHeaderNames():获取头名字的一个枚举。 <br/>
<%-- <%=request.getHeaders()%>getHeaders(String s):获取头的全部值的一个枚举。 <br/>
 --%><%=request.getRemoteAddr()%>getRemoteAddr():获取客户的IP地址。 <br/>
<%=request.getRemoteHost()%>getRemoteHost():获取客户机的名称（如果获取不到，就获取IP地址）。 <br/>
<%=request.getServerName()%>getServerName():获取服务器的名称。 <br/>
<%=request.getServerPort()%>getServePort():获取服务器的端口。 <br/>
<%-- <%=request.getParameterNames()%>getPaeameterNames():获取表单提交的信息体部分中name参数值的一个枚举<br/>
 --%></body>
</html>