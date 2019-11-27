import java.sql.*;


public class Sample79 {

	 static void main(String[] args) throws SQLException,ClassNotFoundException
		{
			//Register DB driver
			   Class.forName("com.mysql.jdbc.Driver");
			  // Establish Database connection(url,  user, password)
			  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffanyaamira","root", "welcome");
			  // Create a statement
			  Statement st = conn.createStatement();
			  // Execute a statement
			 ResultSet rs= st.executeQuery("select *from employee where empno =102 or empno=105");
			 while(rs.next())
			 {
				 System.out.println(rs.getInt(1));
				 System.out.println(rs.getString(2));
				 System.out.println(rs.getInt(3));
			 }
			   //Close Statement  and connection 
			   st.close();
			   conn.close();
		}

	


	}

}
