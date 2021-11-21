package pkg;

import java.util.Scanner;

public class TryCatch2 {

	public static void main(String[] args) {

//		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫번째 수는 : ");
			String s1 = sc.nextLine();
			int n1 = Integer.parseInt(s1);
			
			System.out.print("두번째 수는 : ");
			String s2 = sc.nextLine();
			int n2 = Integer.parseInt(s2);
			
			int res = kaja(n1, n2);		//	Once the denominator is 0, error occurs here.
			System.out.println(res);
			
			sc.close();
//		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없댜");
//			e.printStackTrace();
//		}

	}

	private static int kaja(int n1, int n2) throws ArithmeticException {
		return n1 / n2;
	}

}
