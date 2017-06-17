<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request对象</title>
<link type="text/css" rel="stylesheet" href="../css/style.css">
</head>
<body>
<br>

<table width="307" height="256" border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="78A3D3">
  <tr>
    <td height="202" valign="top" bgcolor="#FFFFFF">
	<br>
	<font size="4pt">&nbsp;&nbsp;用&nbsp;户&nbsp;注&nbsp;册&nbsp;信&nbsp;息</font>
	<hr width="90%" color="#999999">
	<form name="form1" method="post" action="4_1_dealwith.jsp">
	<table width="244" border="0" align="center">
      <tr>
        <td height="30">账号：&nbsp;&nbsp;&nbsp;</td>
        <td height="30"><input type="text" name="account"></td>
      </tr>
      <tr>
        <td height="30">密码：&nbsp;&nbsp;&nbsp;</td>
        <td height="30"><input type="password" name="password"></td>
      </tr>
		<tr>
        <td height="30">真实姓名：&nbsp;</td>
        <td height="30"><input type="text" name="realname"></td>
	      </tr>
		      <tr>
        <td height="30">Email地址：          </td>
        <td height="30"><input type="text" name="email"></td>
	      </tr>
	        <tr>
        <td height="30">性别：          </td>
        <td height="30">
          <input name="sex" type="radio" class="cannleLine" value="男" checked="checked">
           &nbsp;男&nbsp;&nbsp;&nbsp;
          <input name="sex" type="radio" class="cannleLine" value="女">
         &nbsp;女
       </td>
       </tr>
       <tr>
       <td height="30">兴趣：</td>
        <td height="30">
          <input name="intresting" type="checkbox" class="cannleLine" value="足球" />足球
          <input name="intresting" type="checkbox" class="cannleLine" value="篮球" />篮球
          <input name="intresting" type="checkbox" class="cannleLine" value="排球" />排球
       </td>
          </tr>
       <tr>
       <td height="30">籍贯：</td>
        <td height="30">
         	<select name="hometown">
         		<option value="南昌">南昌</option>
         		<option value="北京">北京</option>
         		<option value="九江">九江</option>
         	</select>
       </td>
          </tr>
	  
      <tr>
        <td width="82" height="30">&nbsp;</td>
        <td width="152"><input type="submit" name="Submit" value=" 注 册 "></td>
      </tr>
    </table>
	 </form>
	
	</td>
  </tr>
</table>
</body>
</html>