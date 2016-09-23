<%@page import="java.util.ResourceBundle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login form</title>
</head>
<body>
<%
	ResourceBundle rb=(ResourceBundle)session.getAttribute("rb");
%>
<form action="login.do" method="post">
	<%=rb.getString("username") %>:<input type="text" name="uname">
	<%=rb.getString("password") %>:<input type="password" name="upass">
	
		<input type="submit" value="login">
	<input type="hidden" name="id" value="login">
	

</form>
</body>
</html>