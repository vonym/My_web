<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request内置对象</title>
</head>
<body>

<%
	request.setCharacterEncoding("utf-8");
    String account = request.getParameter("account");
	String password = request.getParameter("password");
	String realname = request.getParameter("realname");
	String email = request.getParameter("email");
	String sex = request.getParameter("sex");
	//String intresting = request.getParameter("intresting");
	String[] intresting= request.getParameterValues("intresting");
	
	String hometown = request.getParameter("hometown");
	//out.println(intresting);
	 
	/*  for(int i=0;i<intresting.length;i++){
		System.out.println("兴趣："+intresting[i]);
	} */
	  
	
 	request.setAttribute("account", account);
	request.setAttribute("password", password);
	request.setAttribute("realname", realname);
	request.setAttribute("email", email);
	request.setAttribute("sex", sex);
	request.setAttribute("intresting", intresting);
	request.setAttribute("hometown", hometown); 
	
	/* Enumeration<String> e = request.getParameterNames();
	 
	while(e.hasMoreElements())
	{
		  
	       String thisName=e.nextElement().toString();
	       String thisValue=request.getParameter(thisName);
	       System.out.println(thisName+"--------------"+thisValue);
	}    */
%>
  <jsp:forward page="4_1_userInfo.jsp"/>  
</body>
</html>