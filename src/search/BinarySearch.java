package search;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 11, 84, 45, 78, 34, 9, 2 };
		
		Arrays.sort(arr);
		
		System.out.println("78 is on index of " + Arrays.binarySearch(arr, 78));

	}

}

//	Binary Search
//	IF RESULT HAS A MINUS SIGN, IT'S NOWHERE.