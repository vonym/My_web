<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bean 作用域</title>
</head>
<body>
<jsp:useBean id="pageScope" scope="page" class="com.bean.Scope" />
<jsp:useBean id="requestScope" scope="request" class="com.bean.Scope" />	
<jsp:useBean id="sessionScope" scope="session" class="com.bean.Scope" />	
<jsp:useBean id="applicationScope" scope="application" class="com.bean.Scope" />
		<center>
			<table width="296" border="0" align="center" cellspacing="0">
              <tr>
                <td width="263"><span class="STYLE7">使用page获取的数据为：</span></td>
                <td width="29">
                  <div align="center" class="STYLE10">
                    <div align="left">
                      <%
 						out.println(pageScope.getNmuber());
 						%>                
                      </div>
                </div></td>
              </tr>
              <tr>
                <td><span class="STYLE7">使用request获取的数据为：</span></td>
                <td>
                  <div align="center" class="STYLE10">
                    <div align="left">
                      <%
 						out.println(requestScope.getNmuber());
 						%>                
                      </div>
                  </div></td>
              </tr>
              <tr>
                <td><span class="STYLE7">使用session获取的数据为：</span></td>
                <td>
                  <div align="center" class="STYLE10">
                    <div align="left">
                      <%
 out.println(sessionScope.getNmuber());
 %>                
                      </div>
                  </div></td>
              </tr>
              <tr>
                <td><span class="STYLE7">使用application获取的数据为：</span></td>
                <td>
                  <div align="center" class="STYLE10">
                    <div align="left">
                      <%
 out.println( applicationScope.getNmuber());
 %>                
                      </div>
                  </div></td>
              </tr>
    </table>
</body>
</html>