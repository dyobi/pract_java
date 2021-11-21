package pkg;

import java.util.Scanner;

public class TryCatch { // 분모에 0을 넣는 코드

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);

			String one = sc.nextLine(); // nextLine은 그대로 다받아들이고 next는 문자만 받아들임(space제외시킴)
			int n1 = Integer.parseInt(one);

			System.out.print("The second number is : ");

			String two = sc.nextLine();
			int n2 = Integer.parseInt(two);

			System.out.println(n1 / n2);

			sc.close();

		} catch (NumberFormatException e) {
			
			System.out.println("Please input numbers!!!");
			System.out.println(e);
			
		} catch (ArithmeticException e) {
			
			System.out.println("0이 아닌 다른값으로 입력하라는~~");
			
		} catch (Exception e) {

//			e.printStackTrace();
			System.out.println(e);					//	=> java.lang.ArithmeticException: / by zero
//			System.out.println(e.getMessage());		//	=> / by zero
			System.out.println("You can't put zeros in the denominator dumbass");

		} finally {

			System.out.println("Goooooooooood");

		}

	}

}

//* Exception (예외 / 에러)
//	...java.lang.Arithmetic exception /by zero
//	-- 콘솔화면에서 맨 처음 난 에러, 자세히 읽어본다 (주로 syntax error)
//	
//	예외 : Exception (내장 클래스, 예외클래스중의 조상)
//	try {} : 예외날지도 몰라
//	catch {} : 예외 시 처리하기
//	finally {} : 무조건 처리
//	
//	예외 발생시 JVM에게 전달됨
//	
//	ex) java  -- JVM
//		c#  -- CLR(Common Language Runtime) 