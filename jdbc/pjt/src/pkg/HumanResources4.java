package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class HumanResources4 {

	static String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
//	static String url = "jdbc:oracle:thin:@172.26.0.218:1521:xe";
	static String user = "hr";
	static String pwd = "hr";
	
	static String sql = "INSERT INTO TelTable5 VALUES (?, ?, ?, ?)";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, user, pwd);
		PreparedStatement pst = con.prepareStatement(sql);
		
		int id = Integer.parseInt(JOptionPane.showInputDialog("What's your ID?"));
		String name = JOptionPane.showInputDialog("What's your name?");
		String tel = JOptionPane.showInputDialog("What's your number?");
		String hire_date = JOptionPane.showInputDialog("When were you hired? ex)22-APR-21");

		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, tel);
		pst.setString(4, hire_date);
		
		int res = pst.executeUpdate();
		
		System.out.println("잘들어봐라 " + res + "행 INSERT 했다");
		
		con.close();

	}

}
