<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FOR TOKENS</title>
</head>
<body>
<%
String URL="www.instagram.com";
%>
<c:forTokens items="<%=URL %>" delims="." var="temp">
${temp }
<br>
</c:forTokens>


</body>
</html>