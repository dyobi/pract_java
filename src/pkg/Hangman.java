package pkg;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input a term what you wanna solve");

		// INIT -----

		String answer = sc.next().toUpperCase();

		char[][] arr = new char[2][answer.length()];

		for (int i = 0; i < answer.length(); i++) {
			arr[0][i] = answer.charAt(i);
			arr[1][i] = '_';
		}

		// SOLVE -----

		int res = hangmanSolve(arr, sc);

		System.out.println();
		if (res == 0)
			System.out.println("GAME OVER");
		else
			System.out.println("You solved! Conglatultions!");

		sc.close();

	}

	private static int hangmanSolve(char[][] arr, Scanner sc) {

		int life = 1;

		for (int i = 0; i < life; i++) {
			System.out.println();
			System.out.println("ALPHABET : ");
			char tmp = Character.toUpperCase(sc.next().charAt(0));

			for (int j = 0; j < arr[0].length; j++) {
				arr[1][j] = (arr[0][j] == tmp ? tmp : arr[1][j]);
				System.out.print(arr[1][j] + "\t");
			}
			System.out.print("\t ATTEMPT : " + life++);
			System.out.println();

			if (life == 14)
				return 0;
			else {
				for (int k = 0; k < arr[1][k]; k++) {
					if (arr[1][k] == '_') {
						break;
					} else if (k == arr[1].length - 1) {
						return 1;
					}
				}
			}
		}
		
		return 0;

	}

}
