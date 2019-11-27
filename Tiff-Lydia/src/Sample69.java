// java Database Connectivity JDBC
import java.sql.*;
public class Sample69 
{
   public static void main(String[] args)  throws SQLException, ClassNotFoundException
   {
	 //Register DB driver
	   Class.forName("com.mysql.jdbc.Driver");
	  // Establish Database connection(url,  user, password)
	  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root", "welcome");
	  // Create a statement
	  Statement st = conn.createStatement();
	  // Execute a statement
	  st.execute("create database tiffanyaamira");
	   //Close Statement  and connection 
	   st.close();
	   conn.close();

	}

}
