package employeeContactList;

import java.util.Date;

public class UserWrapper {
	
	private int		id;
	
	private String	name;
	
	private String	tel;
	
	private Date	hireDate;
	
//	--- Getters & Setters ---
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

//	--- Constructor ---
	
	public UserWrapper(int id, String name, String tel, Date hireDate) {
		
		setId(id);
		setName(name);
		setTel(tel);
		setHireDate(hireDate);
		
	}

}
