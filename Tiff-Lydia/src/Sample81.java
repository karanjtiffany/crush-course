import java.sql.*;
import java.util.*;
public class Sample81 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiffanyaamira","root", "welcome");
		PreparedStatement pst = conn.prepareStatement("update  employee set empsal=? where empno=? ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Salary");
		pst.setInt(1, sc.nextInt());
		System.out.println("Enter Employee Number");
		pst.setInt(2, sc.nextInt());
		pst.execute();
		pst.close();
		conn.close();
				
	}

}
