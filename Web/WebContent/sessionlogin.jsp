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
Object o = session.getAttribute("Moses");
String s = (String) o;
out.println("<center><h1>USER ID:"+s.toUpperCase()+"</h1></center>");

%>

</body>
</html>