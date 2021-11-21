package objectOriented;

import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {

		
//		stack => filo : first in last out / lifo : last in first out
//		크롬에서 뒤로가기 버튼누르면 뒤로가듯 쌓아놓은것을 하나씩
//		역순처리 *Tower of Hanoi
		
		Stack <String> stack = new Stack <String> ();

		stack.push("카레");
		stack.push("볶음밥");
		stack.push("뚝불고기");
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());		//	pop -> delete

		System.out.println(stack);

	}

}
