package objectOriented;

class Parents {
	
	protected int	diamond;	// 부모와 자식간의 상속간에서만 protected!
	
	public void money() {
		System.out.println("I have a bunch of money!");
	}
	
}


class Child extends Parents {
	
	public void car() {
		super.diamond = 3;
		System.out.println("I got brand new Lamborghini :)");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		Parents parents = new Parents();
		
		parents.money();

		Child child = new Child();
		
		child.money();
		child.car();
		
		System.out.println(child.diamond);

	}

}
