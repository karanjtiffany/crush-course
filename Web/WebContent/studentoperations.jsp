<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="grey"><center><b><h1>
<%
Object o = session.getAttribute("Moses");
String s = (String) o;
out.println("<b><div align=right>User Id:"+s+"</div></b>");
%>
<a href="http://localhost:8080/Web/insert.jsp">Insert</a><br>
<a href="http://localhost:8080/Web/update.jsp">Update</a><br>
<a href="http://localhost:8080/Web/delete.jsp">Delete</a><br>
<a href="http://localhost:8080/Web/select.jsp">Select</a>
</h1>
</b>
</center>
</body>
</html>