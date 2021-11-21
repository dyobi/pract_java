package objectOriented;

class Car2 {
	
	private String	color;
	
	private int		door;
	
	public void		drive() {
		System.out.println("Let's go to drive!");
	}
	
//	public void		print() {
//		System.out.println(color + "\t" + door);
//		System.out.println(this.getColor() + "\t" + this.getDoor());
//	}
	
	public String	toString() {
		return "자동차 색은 " + this.color + " 이고" + " 문의 갯수는 " + this.door + " 이다.";
	}
	
	//	--- Getters / Setters ---
	
	public String	getColor() {
		return color;
	}
	
	public void		setColor(String color) {
		this.color = color;
	}
	
	public int		getDoor() {
		return door;
	}
	
	public void		setDoor(int door) {
		this.door = door;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		
		Car2 car1 = new Car2();

		car1.setDoor(4);
		car1.setColor("red");
		
		System.out.println(car1.toString());
		
		Car2 car2 = new Car2();
		
		car2.setDoor(2);
		car2.setColor("blue");

		System.out.println(car2);	//	toString()은 생략해도 된다. 알아서 찾음.
		
	}

}

//	this <= 자기 자신을 참조하는 객체