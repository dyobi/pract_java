package pkg;

import java.util.Date;
import java.util.Scanner;

public class FromBirth {

	public static void main(String[] args) {

		try {
		
		Date current = new Date();
		Scanner sc = new Scanner(System.in);

		System.out.println("몇년도에 태어나셨나요?");
		int year = Integer.parseInt(sc.next());
		
		System.out.println("몇월에 태어나셨나요?");
		int month = Integer.parseInt(sc.next());
		
		System.out.println("몇일에 태어나셨나요?");
		int date = Integer.parseInt(sc.next());
		
		Date birthday = new Date(year - 1900, month - 1, date);
		
		System.out.println("현재 날짜는 " + (current.getYear() + 1900) + "년 " + (current.getMonth() + 1) + "월 " + current.getDate() + "일 " + "입니다.");
		System.out.println("지금까지 살아온지 " + ((current.getTime() - birthday.getTime()) / (1000 * 60 * 60 * 24) + 1) + "일 되셨습니다.");
		
		sc.close();
		
		} catch (Exception e) {
			
			System.out.println("정확하게 입력해 주세요.");
			
		}

	}

}
