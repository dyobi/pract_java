package pkg;

class Parents {
	
	public void car() {
		System.out.println("Let's go to drive by parents' car");
	}
	
}

class Child extends Parents {
	
	public void car() {		//	Overriding은 상속관계에서 사용
		System.out.println("Let's go travelling by children's car");
	}
	
}

public class Drive {

	public static void main(String[] args) {

		Parents p = new Parents();
		Child c = new Child();
		
		p.car();
		c.car();
		System.out.println();

		Parents p1 = c;
//		Parents p1 = new Child();		//	Object casting
		
//		Child c2 = (Child)(new Parents());		//	Error
//		c2.car();
		
		p1.car();

	}

}
