package method;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		System.out.println(plus(a, b));

		sc.close();

	}

	private static int plus(int a, int b) {	// return type 반환형
		
		return a + b;
		
	}

}

//	Method 3형식