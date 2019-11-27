import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample72 
{

	public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/surya","root","welcome");
		Statement st = conn.createStatement();
		st.execute("create table student(stid int,stname varchar(15),stcity varchar(10)");
		st.close();
		conn.close();

	

}
}
