<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit</title>
</head>
<body>
Name: <%= request.getParameter("name") %><br>
Gender: <%= request.getParameter("gender") %><br>
Language Know: <%
String[] country = request.getParameterValues("language");
if (country != null)
{
	for(int p=0; p<country.length ;p++){
	 out.print(country[p])	;
	 out.print("<br>");
	}
}
	else {out.print("Nothing selected")	;}
%>
Country: <%= request.getParameter("country") %><br>

</body>
</html>