package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class HumanResources3 {
	
	static String url = "jdbc:oracle:thin:@127.0.0.1:1521/XEPDB1";
	static String user = "hr";
	static String pwd = "hr";

	static String sql = "SELECT e.first_name AS \"fn\", d.department_name AS \"dn\"," + 
						" SUBSTR(e.hire_date, 4, 3) AS \"hd\"" +
						" FROM employees e, departments d, locations l" +
						" WHERE e.department_id = d.department_id" +
						" AND d.location_id = l.location_id" + 
						" AND LOWER(l.city) = ?";
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, user, pwd);
		PreparedStatement pst = con.prepareStatement(sql);
		
		System.out.println("City : ");
		String city = new Scanner(System.in).next().toString().toLowerCase();
		
		pst.setString(1, city);
		
		ResultSet res = pst.executeQuery();
		
		System.out.println("No" + "\t" + "First_name" + "\t" + "Department" + "\t" + "Hired_month");
		System.out.println("-------------------------------------------------");
		
		while (res.next()) {
			String fn = res.getString("fn");
			String dn = res.getString("dn");
			String hd = res.getString("hd");
			System.out.println(res.getRow() + "\t" + fn + (fn.length() >= 8 ? "\t" : "\t\t") + dn + "\t" + hd);
		}
		
		con.close();

	}

}
