<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="grey">
<%
Object o = session.getAttribute("Moses");
String s = (String) o;
out.println("<b><div align=right>User Id:"+s+"</div></b>");
%>
<form method="get"action="insertstudent.jsp">
<pre><b>Student ID:</b><input type="text" name="tf1"/><br>
<b>Student Name:</b><input type="text" name="tf2"/><br>
<b>Student City:</b><input type="text" name="tf3"/><br></pre>
<input type="submit" name="b1" value="Insert Record" />
</body>
</html>