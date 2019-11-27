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
String s = request.getParameter("tf1");
int n = Integer.parseInt(s);
%>
<table border="2" bordercolor="purple">
<thead><th>OUTPUT</th></thead>
<tbody>
<%
for(int i=1;i<=10;i++)
{
 out.println("<tr><td>"+n+"*"+i+"="+(n*i)+"</td></tr><br>");
}

%>
</tbody>
</table>
</body>
</html>