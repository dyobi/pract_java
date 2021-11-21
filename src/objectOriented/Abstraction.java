package objectOriented;

abstract class Fruits {				//추상화를 하기위해 abstract 무조건
	
	public void good() {
		System.out.println("Getting healthier when you eat");
	}
	
	public abstract void eat();		//추상 메소드	//선언만	//상속하는 자녀쪽에서 코드를짜줘야함
	
}

class Apple extends Fruits {
	
	@Override
	public void eat() {
		System.out.println("Let's eat apples!");
	}
	
}

class Pear extends Fruits {
	
	@Override
	public void eat() {
		System.out.println("Let's eat pears!");
	}
	
}

class Persimmon extends Fruits {
	
	@Override
	public void eat() {
		System.out.println("Let's eat persimmons");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {

		Fruits f1 = new Apple();
		
		f1.eat();
		f1.good();
		
		Fruits f2 = new Pear();
		
		f2.eat();
		f2.good();
		
		Fruits f3 = new Persimmon();
		
		f3.eat();
		f3.good();

	}

}
