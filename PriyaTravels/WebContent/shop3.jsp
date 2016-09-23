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
	<h1>Furniture Shop</h1>
	<form action="shop3.do" method="post">
	<input type="hidden" name="id" value="shopping">
	<input type="hidden" name="shopid" value="shop3">
		<input type="checkbox" name="c7" value="chair">Chair
		<input type="checkbox" name="c8" value="table">table
		<input type="checkbox" name="c9" value="sofa">Sofa
		
		<input type="submit" value="Invoice....">
	</form>
</body>
</html>