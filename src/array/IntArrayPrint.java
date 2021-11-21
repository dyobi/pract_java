package array;


public class IntArrayPrint {

	public static void main(String[] args) {

		int [][] arr = {
				{100, 200, 300},
				{400, 500, 600}
		};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();	//	Line Skip
		}

	}

}
