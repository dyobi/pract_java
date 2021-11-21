package pkg;

import java.util.Scanner;

public class Throw {

	private static int go(int n1, int n2) {

		if (n2 == 0) {
			System.out.println("0으로 나눌 수 없다");
			throw new ArithmeticException();		//	Throw
		} else return n1 / n2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		int n1 = Integer.parseInt(s1);
		
		System.out.print("두번째 수는 : ");
		
		String s2 = sc.nextLine();
		int n2 = Integer.parseInt(s2);
		
		int res = go(n1, n2);
		
		System.out.println(res);
		
		sc.close();

	}

}
