
import java.sql.*;
public class Assignment10 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		//Register DB driver
		   Class.forName("com.mysql.jdbc.Driver");
		  // Establish Database connection(url,  user, password)
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root", "welcome");
		  // Create a statement
		  Statement st = conn.createStatement();
		  // Execute a statement
		  st.execute("create database melba");
		   //Close Statement  and connection 
		   st.close();
		   conn.close();

	}

}