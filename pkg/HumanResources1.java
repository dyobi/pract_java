package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HumanResources1 {
	
	static String url = "jdbc:oracle:thin:@127.0.0.1:1521/XEPDB1";
	
	static String user = "hr";
	
	static String pwd = "hr";
	

	@SuppressWarnings("resource")
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection(url, user, pwd);

//		String sql = "SELECT * FROM employees";
		
		System.out.println("Input first name");
		String name = new Scanner(System.in).next().toString().toLowerCase();
		String sql = "SELECT * FROM employees WHERE LOWER(first_name) = \'" + name + "\'";

		Statement st = con.createStatement();
		
		ResultSet res = st.executeQuery(sql);
		
		System.out.println("id" + "\t" + "emp_id" + "\t" + "first_name" + "\t" + "hire_date");
		System.out.println("------------------------------------------");
		
		while (res.next()) {
			int id = res.getInt("employee_id");
			String first_name = res.getString("first_name");
			String hire_date = res.getString("hire_date").substring(0, 10);
			System.out.println(res.getRow() + "\t" + id + "\t" + first_name + (first_name.length() >= 8 ? "\t" : "\t\t") + hire_date);
		}
		
		con.close();
		
	}

}
