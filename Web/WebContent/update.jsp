<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor ="yellow">
<% 
try{
	
    Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moses","root", "welcome");
	PreparedStatement pst = conn.prepareStatement("update  student where scity=Miami where sno =108");
	pst.close();
	conn.close();
	out.println("<b>Student Record updated</b><br>");
	}
	catch(Exception e)
	{
		out.println(e.getMessage());
	}
	%>
	<a href="http://localhost:8080/Web/studentoperations.jsp">Home</a><br>

</body>
</html>