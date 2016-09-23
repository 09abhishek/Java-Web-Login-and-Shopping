<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Language Selection page!</title>
</head>
<body>
<form action="language.do" method="post">
<h1>Choose your language</hi>

<select name="lang">
  <option value="ta">Tamil</option>
  <option value="te">Telgu</option>
  <option value="hi">Hindi</option>
</select>
<input type="submit" value="ok">
<input type="hidden" name="id" value="language">
</form>
</body>
</html>