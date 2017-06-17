<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:directive.page import="connDB.ConnDBClass"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 	request.setCharacterEncoding("utf-8");
	String id=request.getParameter("ID");
	String name=request.getParameter("name");
	String studentID=request.getParameter("studentID");
	String sex=request.getParameter("sex");
	String address=request.getParameter("address");
	String tel=request.getParameter("tel");
	String sql=null;
	ConnDBClass connDB=new ConnDBClass();
	out.print(request.getParameter("update"));
	
	if(request.getParameter("insert").equals("增加")){
		sql="insert into studentinfo(id,name,studentID,sex,address,tel)"+
				"values('"+id+"','"+name+"','"+studentID+"','"+sex+"','"+address+"','"+tel+"') ";
		connDB.executInsert(sql);
		out.print(sql);
	}else if(request.getParameter("update").equals("修改")){
		sql="update studentinfo set name='"+name+"',studentID='"+studentID+"',"+
				"sex='"+sex+"',address='"+address+"',tel='"+tel+"' where id='"+id+"'";
		connDB.executUpdate(sql);
	}else if(request.getParameter("del").equals("删除")){
		sql="delete from studentinfo where id='"+id+"'";
		connDB.executDelete(sql);
	}else
		out.print("失败。。。。");
		connDB.closeConnetion();
		response.sendRedirect("index.jsp");
	%>
</body> 
</html>