import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample74 {

	public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
		//Register DB driver
		   Class.forName("com.mysql.jdbc.Driver");
		  // Establish Database connection(url,  user, password)
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffanyaamira","root", "welcome");
		  // Create a statement
		  Statement st = conn.createStatement();
		  // Execute a statement
		  st.execute("update employee set empname='Alex' where empno=105");
		   //Close Statement  and connection 
		   st.close();
		   conn.close();
	}

}
