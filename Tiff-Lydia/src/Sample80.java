import java.sql.*;
public class Sample80 {
	public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffanyaamira","root", "welcome");
		PreparedStatement pst = conn.prepareStatement("insert into employee values(?,?,?)");
		pst.setInt(1, 110);
		pst.setString(2,"Edwin");
		pst.setInt(3, 2700);
		pst.execute();
		pst.close();
		conn.close();
				
	}

}
