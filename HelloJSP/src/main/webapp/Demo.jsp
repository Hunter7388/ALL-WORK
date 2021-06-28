<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DEMO</title>
</head>
<body>
ITS for original page
<%--  <jsp:forward page="Forward.jsp"></jsp:forward>  --%>
<%
//request.getRequestDispatcher("Forward.jsp").forward(request,response);
response.sendRedirect("ReDirect.jsp");

%>>
</body>
</html>