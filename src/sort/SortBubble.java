package sort;

import java.util.Arrays;

public class SortBubble {

	public static void main(String[] args) {

		int[] arr = { 10, 90, 100, 60, 70, 23, 110 };

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] < arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}

			}

		}

		System.out.println(Arrays.toString(arr));

	}

}

//for (int i = 0; i < (arr.length - 1); i++) {
//	for (int j = 0; j < (arr.length - 1); j++) {
//		if (arr[j] < arr[j + 1]) {
//			swap;
//		}
//	}
//}