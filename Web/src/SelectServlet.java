
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.mysql.jdbc.PreparedStatement;

public class SelectServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response, PrintWriter PrintWriter) throws ServletException, IOException
	{
		PrintWriter=response.getWriter();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?serverTimzone=GMT"/"root","tiffanyaamira");
		    java.sql.PreparedStatement pst = conn.prepareStatement("select * from emp where empcity=?");
		    pst.setString(1, "cal");
		    ResultSet rs = pst.executeQuery();
		    while(rs.next())
		    {
		    	Out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
		    }
					
		}
	}

}
