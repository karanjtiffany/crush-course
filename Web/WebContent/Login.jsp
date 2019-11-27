<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String usr = request.getParameter("tf1");
String pwd = request.getParameter("tf2");
if(usr.equals(pwd))
{
	session.setAttribute("Moses",usr);
	response.sendRedirect("studentoperations.jsp");
}
else
{
	out.println("invalid");
}

%>

</body>
</html>