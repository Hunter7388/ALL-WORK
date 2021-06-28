<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Member Area</title>
</head>
<body>

<%

String username=null,sessionId=null;
if(request.getSession().getAttribute("username") == null)
{
	response.sendRedirect(request.getContextPath()+"/MemberAreaController?action=memberArea");
	
	
}
else {
	username=request.getSession().getAttribute("username").toString();
	sessionId=request.getSession().getId();
}

%>

User name : <%= username %><br/>
Current Session : <%= sessionId %><br/>
Member Area!!!!

<form action="<%= request.getContextPath() %>/MemberAreaController " method="get" >
<input type="hidden" name ="action" value="destroy" >


<input type="submit" value="logout">




</form>
</body>
</html>
<%-- 
Cookie[]  cookies = request.getCookies();
if(cookies != null)
{
	for (Cookie cookie:cookies)
	{
		if(cookie.getName().equals("username"))
		{
			username = cookie.getValue();
		}
		if(cookie.getName().equals("JSESSIONID"))
		{
			sessionId= cookie.getValue();
		}
		
	}
	
}
--%>