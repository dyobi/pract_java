package pkg;

import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mon = Integer.parseInt(sc.next());
		
		switch (mon) {
		
		case 2 :
			System.out.println(28); break;
		
		case 1 :
		case 3 :
		case 5 :	
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(31); break;
		
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println(30); break;
		
		default :
			System.out.println("Input correctly [ 1 to 12 ]"); break;
		
		}
		
		sc.close();

	}

}
