import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample73 
{

	public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
		//Register DB driver
		   Class.forName("com.mysql.jdbc.Driver");
		  // Establish Database connection(url,  user, password)
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffanyaamira","root", "welcome");
		  // Create a statement
		  Statement st = conn.createStatement();
		  // Execute a statement
		  st.execute("insert into employee values(101,'Tiffany',7500)");
		  st.execute("insert into employee values(102,'Moses',3500)");
		  st.execute("insert into employee values(103,'Melba',9000)");
		  st.execute("insert into employee values(104,'Trevor',2500)");
		  st.execute("insert into employee values(105,'Natasha',3200)");
		   //Close Statement  and connection 
		   st.close();
		   conn.close();

	}

}
