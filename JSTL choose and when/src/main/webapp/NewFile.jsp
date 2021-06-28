<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-Type" content="text/html ; charset=ISO-8859-1">
<title>demmo</title>
</head>
<body>
<c:choose>
   <c:when test="${param.lang == 'java'} ">
   Welcome to you
   
   </c:when>
<c:when test="${param.lang == 'CPP'} ">
   Welcome to you in CPP
   
   </c:when>
 <c:when test="${param.lang == null } "> NOT Welcome  </c:when>
  

<c:otherwise>Raju</c:otherwise>
</c:choose>
</body>
</html>