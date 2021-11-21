package sort;

import java.util.Arrays;
//import java.util.Collections;

public class Sort {

	public static void main(String[] args) {

		int[] arr = { 10, 90, 100, 60, 70 };
		
		Arrays.sort(arr);	//	Ascending
		
//		Arrays.sort(arr, Collections.reverseOrder());	//	Descending (Integer Type)
		
		System.out.println(Arrays.toString(arr));

	}

}

//	Sort Function !