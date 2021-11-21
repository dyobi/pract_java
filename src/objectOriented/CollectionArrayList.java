package objectOriented;

import java.util.ArrayList;

public class CollectionArrayList {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();
		
		arr.add(new Integer(300));		// Wrapping	-> 클래스화	*null처리 가능함
		arr.add(new Double(100.7));
		arr.add(new Character('A'));
		arr.add(new String("ondal"));
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		

	}

}

//		ArrayList 는 arr[0] = '' 처럼 입력이 되지 않음