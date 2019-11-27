import java.sql.*;
import java.util.*;
public class Sample84 {
public static void main(String[] args)throws SQLException,ClassNotFoundException
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffanyaamira","root", "welcome");
			PreparedStatement pst = conn.prepareStatement("select * from employee where empno = ?");
			System.out.println("Enter employee Number:");
			Scanner sc = new Scanner(System.in);
			pst.setInt(1, sc.nextInt());
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
			}
			pst.execute();
			pst.close();
			conn.close();
		}


	}


