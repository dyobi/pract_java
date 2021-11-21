package pkg;

public class While {

	public static void main(String[] args) {

		int cnt = 0;
		int sw = 0;

//		Flag 기법 / Sw 기법
		while (sw == 0) {
			cnt++;
			System.out.println(cnt);

			if (cnt == 10) {
				System.out.println("IT'S OVER!");
				sw = 1;
			}
		}

//		while (true) {
//			cnt++;
//			System.out.println(cnt);
//			
//			if (cnt == 10) {
//				System.out.println("IT'S OVER!");
//				break;
//			}
//		}

	}

}
