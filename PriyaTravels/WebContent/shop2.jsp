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
	<h1>House stop!!</h1>
	<form action="shop2.do" method="post">
	<input type="hidden" name="id" value="shopping">
	<input type="hidden" name="shopid" value="shop2">
		<input type="checkbox" name="c4" value="Bottle">Bottle
		<input type="checkbox" name="c5" value="jug">Jug
		<input type="checkbox" name="c6" value="mug">mug
		<input type="submit" value="shop3....">
	</form>
</body>
</html>