package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HumanResources2 {
	
	static String url = "jdbc:oracle:thin:@127.0.0.1:1521/XEPDB1";
	static String user = "hr";
	static String pwd = "hr";

//	static String sql = "SELECT * FROM employees WHERE LOWER(first_name) = ?";
	static String sql = "SELECT * FROM employees WHERE LOWER(first_name) LIKE ?";

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, user, pwd);
		PreparedStatement pst = con.prepareStatement(sql);
		
		System.out.println("Input");
		String name = new Scanner(System.in).next().toString().toLowerCase();
		
		pst.setString(1, name + "%");
		
		ResultSet res = pst.executeQuery();
		
		while (res.next()) {
			String last_name = res.getString("last_name");
			String first_name = res.getString("first_name");
			int salary = res.getInt("salary");
			System.out.println(res.getRow() + "\t" + first_name + "\t" + last_name + "\t" + salary);
		}
		
		con.close();
	
	}

}
