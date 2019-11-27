import java.sql.*;
public class Sample71 {

	public static void main(String[] args)throws SQLException, ClassNotFoundException
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","welcome");
	Statement st = conn.createStatement();
	st.execute("create database ");
	st.close();
	conn.close();

	}

}
