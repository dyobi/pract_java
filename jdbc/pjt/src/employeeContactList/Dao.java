package employeeContactList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dao {

	private Connection con;
	private String sql = "";
	private PreparedStatement pst = null;
	private ResultSet res = null;
	
	public Dao() throws ClassNotFoundException, SQLException {
		con = new DBConnection().getConnection();
	}
	
//	SELECT
	public ArrayList<UserWrapper> getAllInfo() throws SQLException {
		
		sql = "SELECT * FROM TelTable5 ORDER BY id";
		ArrayList<UserWrapper> resList = new ArrayList<UserWrapper>();
		
		pst = con.prepareStatement(sql);
		res = pst.executeQuery();
		
		while (res.next()) {
			resList.add(new UserWrapper(res.getInt("id"), res.getString("name"), res.getString("tel"), res.getDate("d")));
		}
		
		return resList;
		
	}
	
//	INSERT
	public int insertUser(int id, String name, String tel, String date) throws SQLException {
		
		sql = "INSERT INTO TelTable5 VALUES (?, ?, ?, TO_DATE(?))";
		
		pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, tel);
		pst.setString(4, date);
		
		return pst.executeUpdate();
		
	}
	
//	DELETE (Needs to select id first before deleting it. Unless it exists, has to return something.)
	public void deleteUser(int id) throws SQLException {
		
		sql = "DELETE FROM TelTable5 WHERE id = ?";
		
		pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		
		pst.executeUpdate();
		
	}
	
//	UPDATE (Needs to select id first before updating it. Unless it exists, has to return something.)
	public void updateUser(int id, String tel) throws SQLException {
		
		sql = "UPDATE TelTable5 SET tel = ? WHERE id = ?";

		pst = con.prepareStatement(sql);
		pst.setString(1, tel);
		pst.setInt(2, id);

		pst.executeUpdate();
		
	}

}
