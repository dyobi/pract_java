package objectOriented;

class Carr {
	
	private String	color;
	private int		door;
	
//	--- Constructors ---
	
	public Carr() {}
	
	public Carr(String color) {
		this.color = color;
	}
	
	public Carr(int door) {
		this.door = door;
	}
	
	public Carr(String color, int door) {
		this.color = color;
		this.door = door;
	}
	
//	--- Getters & Setters ---

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	

	public int getDoor() {
		return door;
	}
	
	public void setDoor(int door) {
		this.door = door;
	}
	
	
}

public class Constructor {

	public static void main(String[] args) {

		Carr carr = new Carr("white", 2);

		System.out.println(carr.getColor());
		System.out.println(carr.getDoor());

	}

}

// *****************************************
//
//	객체의 life cycle
//
//	프로그램 main() 에서 출발
//	new	: 객체 생성
//	construction이 만들어짐 (초기치를 넣는 역할)
//		-> 초기치가 없으면 default 생성자가 만들어짐
//	프로그램이 진행하다가
//	객체 정리 : 소멸자가 가동
//	객체소멸 : garbage collector가 전담
//
// *****************************************


