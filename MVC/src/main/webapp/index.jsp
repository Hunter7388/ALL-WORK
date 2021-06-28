<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
</head>
<body>
its home page <br>
<a href="<%= request.getContextPath() %>/controller?page=login">LOGIN</a><br>
<a href="<%= request.getContextPath() %>/controller?page=SignUP">SignUP</a><br>
<a href="<%= request.getContextPath() %>/controller?page=About">About</a>
</body>
</html>