<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<% 
try{
Object o = session.getAttribute("Moses");
String s = (String) o;
out.println("<b><div align=right>User Id:"+s+"</div></b>");
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moses","root", "welcome");
PreparedStatement pst = conn.prepareStatement("select * from student");
out.println("<center><b><h1>List of Students</h1></center></b>");
ResultSet rs = pst.executeQuery();
out.println("<table border=2 bordercolor=pink>");
out.println("<thead><th>Roll Number</th><th>Name</th><th>City</th></thead>");
while(rs.next())
{
	out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr>");
}
 out.println("</table>");
}
catch(Exception e)
{
	out.println(e.getMessage());
}
%>
<a href="http://localhost:8080/Web/studentoperations.jsp">Home</a><br>

</body>
</html>