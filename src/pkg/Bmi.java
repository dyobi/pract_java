//Scanner / JOptionPane

package pkg;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bmi {

	public static void main(String[] args) {
		
//		int height = 180;
//		int weight = 80;
//
//		double bmi = weight / (Math.pow((double)height/100, 2));
//		System.out.println(bmi);
		
//		int ki = 180;
//		int mom = 80;
		
//		모든 사물 = 객체
//		Scanner sc = new Scanner(System.in);	//키보드 입력의 허락 1번만 쓰는것
//		sc는 객체 // 객체.메소드()	ex) main()
		
//		int ki = sc.nextInt();
		
//		System.out.println("What's your height?");
//		double ki = Double.parseDouble(sc.next());
		double ki = Double.parseDouble(JOptionPane.showInputDialog("키는?"));
		
//		System.out.println("What's your weight?");
//		double mom = Double.parseDouble(sc.next());
		double mom = Double.parseDouble(JOptionPane.showInputDialog("몸무게는?"));
		
		double mki = ki / 100.0;
		double bmi = mom / Math.pow(mki, 2);
		System.out.println("비만도 : " + bmi);
		
		if (bmi >= 30.0)
			System.out.println("비만");
		else if (bmi >= 25.0)
			System.out.println("과체중");
		else if (bmi >= 20.0)
			System.out.println("보통");
		else
			System.out.println("저체중");
		
	}

}
