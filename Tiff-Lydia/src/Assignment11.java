import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment11 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		//Register DB driver
		   Class.forName("com.mysql.jdbc.Driver");
		  // Establish Database connection(url,  user, password)
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/melba","root", "welcome");
		  // Create a statement
		  Statement st = conn.createStatement();
		  // Execute a statement
		  st.execute("create table student(stid int,stname varchar(15),stcity varchar(10))");
		   //Close Statement  and connection 
		   st.close();
		   conn.close();

	}

}
