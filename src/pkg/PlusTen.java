package pkg;

import java.util.Scanner;

public class PlusTen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		function(sc);
		
		sc.close();

	}

	private static void function(Scanner sc) {

		int arr[] = new int[10];
		int res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		for (int i = 0; i < arr.length; i++) {
			res = res + arr[i];
		}
		
		System.out.println(res);
	}

}
