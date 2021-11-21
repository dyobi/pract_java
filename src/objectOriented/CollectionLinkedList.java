package objectOriented;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionLinkedList {

	public static void main(String[] args) {

//		Fifo : first in first out / Lilo : last in last out
//		LinkedList <String> queue = new LinkedList <String> ();		// 아래와 똑같음
		Queue <String> queue = new LinkedList <String> ();	// Queue 는 LinkedList 산하에 있음
//		키보드입력, 네트워크접속객체 (기본5명...) 그 이후는 대기 (줄줄이 순서대로) ex) 콜센터 

		queue.offer("바보");		// Add
		queue.offer("온달");
		queue.offer("평강공주");
		
		if (!queue.isEmpty())
			queue.poll();		// Delete
		if (!queue.isEmpty())
				queue.poll();
		queue.offer("홍길동");
		
		System.out.println(queue);

	}

}
