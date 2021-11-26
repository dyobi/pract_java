package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class HumanResources5 {

	static String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	static String user = "hr";
	static String pwd = "hr";
	
	static String sql = "UPDATE TelTable5 SET id = ?, tel = ? WHERE name = ?";

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, user, pwd);
		PreparedStatement pst = con.prepareStatement(sql);
		
		System.out.println("What's your name?");
		String name = sc.next().toString();
		System.out.println("What do you prefer for your ID?");
		int id = Integer.parseInt(sc.next());
		System.out.println("What's your new number?");
		String tel = sc.next().toString();

		pst.setInt(1, id);
		pst.setString(2, tel);
		pst.setString(3, name);
		
		int res = pst.executeUpdate();
		
		System.out.println("잘들어봐라 " + res + "행 UPDATE 했다");
		
		con.close();
		
	}
	
}
