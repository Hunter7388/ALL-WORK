<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--
<a href="<c:url value="/AnotherPage.jsp"/>">Another page</a>  
<c:redirect url ="/AnotherPage.jsp"></c:redirect>
--%>

<c:catch var="Exception">
<%
int x=10/0;
%>
</c:catch>
${ Exception} <br>
Testing
</body>
</html>
