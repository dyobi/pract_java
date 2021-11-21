package pkg;

import java.util.Scanner;

public class PlusTwoNumbs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		plus(a, b);
		
		sc.close();

	}

	private static void plus(int a, int b) {

		System.out.println(a + b);
		
	}

}
