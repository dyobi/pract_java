package employeeContactList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private Connection	con;
	private String		url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private String		user = "hr";
	private String		pwd = "hr";
	
	public Connection getConnection() {
		return con;
 	}
	
	public void closeConnection() throws SQLException {
		con.close();
		
		System.out.println("The connection has been closed.");
	}

	public DBConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, user, pwd);
		
		System.out.println("Database has been connected.");
		
	}

}
