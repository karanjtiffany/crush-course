import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Assignment13
{
	public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
		
		   Class.forName("com.mysql.jdbc.Driver"); 
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffanyaamira","root", "welcome");
		   Statement st = conn.createStatement();
		 ResultSet rs= st.executeQuery("select * from employee");
		 while(rs.next())
		 {
			 System.out.println(rs.getInt(1)+  " " +rs.getString(2)+ " " +rs.getInt(3));
		 }
		   
		   st.close();
		   conn.close();
	}

	}


