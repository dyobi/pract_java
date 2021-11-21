package method;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		plus(a, b);	// a 와 b 는 arguments
		
		sc.close();
		
	}

	private static void plus(int a, int b) {	//a 와 b 는 parameter

		System.out.println(a + b);
		
	}

}

//	Method 2형식