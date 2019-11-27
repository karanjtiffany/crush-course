<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="grey">
<% 
try{
	String s1 = request.getParameter("tf1");
	int n = Integer.parseInt(s1);
	String s2 = request.getParameter("tf2");
	String s3 = request.getParameter("tf3");
Object o = session.getAttribute("Moses");
String s = (String) o;
out.println("<b><div align=right>User Id:"+s+"</div></b>");
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moses","root", "welcome");
PreparedStatement pst = conn.prepareStatement("insert into student values(?,?,?)");
pst.setInt(1, n);
pst.setString(2, s2);
pst.setString(3, s3);
pst.execute();
out.println("<b>Student Record Inserted</b><br>");
}
catch(Exception e)
{
	out.println(e.getMessage());
}
%>
<a href="http://localhost:8080/Web/studentoperations.jsp">Home</a><br>

</body>
</html>