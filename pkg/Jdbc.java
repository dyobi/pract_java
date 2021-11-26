package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		Connection con1 = null;	// 접속객체 con1선언
		
		Class.forName("oracle.jdbc.driver.OracleDriver");	// 오라클 드라이버 로딩 (ojdbc8.jar, ojdbc6.jar)
		// 대소문자, 띄어쓰기 x	//static method (new 없이 사용)	// 객체.메소드() ==> 클래스.스태틱메소드()
		
		// 1) add throws declaration -> 첫번째것 선택
		// 2) surround with try catch
		
												// @192.168.0.15
		
		// db 접속 	// 클래스.스태틱메소드()			// @192.168.0.13	sid

//		con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
//		con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "1234");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XEPDB1", "hr", "hr");
		
		
		System.out.println("Connected");
		
	}

}

// java data base connectivity [jdbc]

//	java/jdk.../jre/lib/ext 에도 ojdbc6.jar 넣기
//	build path 에서 add external jar <-
//	java/jre/lib/ext 에 ojdbc6.jar 넣기