package objectOriented;

import java.util.Scanner;

class Parent {

	public void drive() {
		System.out.println("Let's travel by parents' car!");
	}

}

class Children extends Parent {

	public void drive() {
		System.out.println("Let's travel by children's car!");
	}
	
}

public class ObjectCasting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which car do you prefer [1:parents' / 2: children's]");

		int input = Integer.parseInt(sc.next());
		
		Parent p = null;

		switch (input) {

		case 1: {
			p = new Parent();
			p.drive();
			break;
		}

		case 2: {
			p = new Children();
			p.drive();
			break;
		}

		default:
			System.out.println("1 OR 2");
			break;
		}
		
		sc.close();

	}

}
