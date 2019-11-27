import java.sql.*;
public class Sample82{

	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffanyaamira","root", "welcome");
		PreparedStatement pst = conn.prepareStatement("delete from employee where empno = ?");
		pst.setInt(1, 110);
		pst.execute();
		pst.close();
		conn.close();
					

	}

}
