import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment12 {

public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
	//Register DB driver
	   Class.forName("com.mysql.jdbc.Driver");
	  // Establish Database connection(url,  user, password)
	  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffanyaamira","root", "welcome");
	  // Create a statement
	  Statement st = conn.createStatement();
	  // Execute a statement
	  st.execute("insert into employee values(106,'Melody',7500)");
	  st.execute("insert into employee values(107,'Maya',1500)");
	  st.execute("insert into employee values(108,'Molly',4000)");
	  st.execute("insert into employee values(109,'Margret',7500)");
	  st.execute("update employee set empname= 'Mary' where empno= 107");
	  st.execute("delete from employee where empno = 107");
	   //Close Statement  and connection 
	   st.close();
	   conn.close();
	}

}

	


