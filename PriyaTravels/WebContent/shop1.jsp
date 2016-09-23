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
	<h1>..Meat Shop....</h1>
	<form action="shop.do" method="post">
	<input type="hidden" name="id" value="shopping">
	<input type="hidden" name="shopid" value="shop1">
		<input type="checkbox" name="c1" value="1kg">1 kg Chicken.
		<input type="checkbox" name="c2" value="2kg">2 Kg Mutton
		<input type="checkbox" name="c3" value="3kg">3 Kg pork
		
		<input type="submit" value="shop2....">
	</form>
</body>
</html>