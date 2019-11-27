

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MultiplyServlet extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	PrintWriter out =	response.getWriter();
	String s1 = request.getParameter("tf1");
	String s2 = request.getParameter("tf2");
	String s3 = request.getParameter("tf3");
	int n1 = Integer.parseInt(s1);
	int n2 = Integer.parseInt(s2);
	int n3 = Integer.parseInt(s3);
	out.println(n1*n2*n3);
	}

}
