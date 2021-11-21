package pkg;

public class MultipleDouble {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println(i + " 동시배수네");
			else if (i % 3 == 0)
				System.out.println(i + "아하");
			else if (i % 5 == 0)
				System.out.println(i + "오예");
		}

	}

}
