<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FOR LOOP </title>
</head>
<body>
<%--
 <c:forEach var="i" begin="4" end="30" step ="4">
${i} <br>
</c:forEach>
--%>
<%
String[] a = new String [3];
a[0]="RAJU";
a[1]="KUMAR";
a[2]="BHAI";
%>
<c:forEach items="<%= a %>" var="Names">

${Names}
<br>


</c:forEach>

</body>
</html>