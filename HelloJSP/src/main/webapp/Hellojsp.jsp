<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title
 here</title>
</head>
<body>
<p> hello in JSP </p>
<%= 987*123*123 %>
<br>
<% 
int x=24;
out.println(x);

%>
<%=x %><%=x %>

<%   response.sendRedirect("https://www.udemy.com/course/full-stack-java-developer-java/learn/lecture/12950762#overview") ;%>
</body>
</html>