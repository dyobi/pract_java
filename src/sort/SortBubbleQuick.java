package sort;

import java.util.Arrays;

public class SortBubbleQuick {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 40, 30 };

		for (int i = 0; i < arr.length - 1; i++) {

			int sw = 0;

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] < arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					sw = 1;
				}

			}

			if (sw == 0)
				break;

		}

		System.out.println(Arrays.toString(arr));

	}

}
