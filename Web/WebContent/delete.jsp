<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
try{
Object o = session.getAttribute("Moses");
String s = (String) o;
out.println("<b><div align=right>User Id:"+s+"</div></b>");
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moses","root", "welcome");
PreparedStatement pst = conn.prepareStatement("delete from student where sno = ?");
pst.setInt(1, 106);
pst.execute();
pst.close();
conn.close();
out.println("<b>Student Record Deleted</b><br>");
}
catch(Exception e)
{
	out.println(e.getMessage());
}
%>
<a href="http://localhost:8080/Web/studentoperations.jsp">Home</a><br>


</body>
</html>