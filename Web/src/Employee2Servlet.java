
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Employee2Servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			String s1=request.getParameter("tf1");
			String s2=request.getParameter("tf2");
			String s3=request.getParameter("tf3");
			String s4=request.getParameter("r1");
			String s5=request.getParameter("c1");
			String s6=request.getParameter("c2");
			
		
		
		
	}

}
