<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="logout.jsp"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Your bill sir.....</h1>
	<%
		Enumeration e=session.getAttributeNames();
		while(e.hasMoreElements()){
			String attributename=e.nextElement().toString();
			String attributevalue=session.getAttribute(attributename).toString();
			if(attributename.equals("rb") || attributename.equals("shopid") || attributename.equals("id")){}
			else{
			out.println("<h1>"+attributename+":"+attributevalue+"</h1>");
			}
		}
	
	%>
</body>
</html>