package search;

public class SequentialSearch {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 30 };
		
		int finding = 30;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == finding) {
				System.out.println(finding + " : " + i + "번째");
			}
		}

	}

}

//	Sequential Searching
//	중복이유로 for 구문은 끝까지 돌림