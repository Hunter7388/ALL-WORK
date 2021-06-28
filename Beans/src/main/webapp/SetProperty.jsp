<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set Property</title>
</head>
<body>
<jsp:useBean id="User" class="My.beans.User" scope="session"> </jsp:useBean>


<form action="GetProperty.jsp" method="post">

first Name : <input type="text" name="firstName" value='<jsp:getProperty property="firstName" name="User"/>'>
last Name : <input type="text" name="lastName" value='<jsp:getProperty property="lastName" name="User"/>'>
<input type="submit" value="submit">
</form>



Values have been set
<%-- 

<jsp:setProperty property="firstName" name="User" value="RajuR"/>
<jsp:setProperty property="lastName" name="User" value="Kumar"/>


--%>

<%--
request.getRequestDispatcher("GetProperty.jsp").forward(request, response);
--%>
</body>
</html>