//Do - while * while 뒤에 ";" 붙임 꼭!

package pkg;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		String num;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("메뉴");
			System.out.println("1.짜장");
			System.out.println("2.짬뽕");
			num = sc.next();
			System.out.println(num);

		} while (!num.equals("1") && !num.equals("2"));
//		} while (num != "1" && num != "2");	<- 번지비교하므로 무한루프

		System.out.println("맛점하세요!");
		sc.close();
	}

}
