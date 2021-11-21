package objectOriented;

class Car {		//	정의
	
	String	color;	//	속성
	
	int		door;	//	속성
	
	public void	drive() {	//	메소드
		
		System.out.println("Let's go to drive!");
		
	}
	
}

public class CarClass {

	public static void main(String[] args) {

		Car car = new Car();	//	생성 / 인스턴스
		
		car.color = "white";
		
		car.door = 2;
		
		car.drive();

		System.out.println("My car color is \"" + car.color.toUpperCase() + ".\"");
		System.out.println("My car has " + car.door + " doors.");

	}

}

//	접근지정자 (access modifier)
//	public		private		protected		(default)

//	PUBLIC		- 외부에서 접근 가능함
//	PRIVATE		- 내부에서만 접근 가능함
//	PROTECTED	- 상속