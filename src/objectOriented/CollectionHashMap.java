package objectOriented;

import java.util.HashMap;
import java.util.Set;

public class CollectionHashMap {

	public static void main(String[] args) {

		HashMap <Integer, String> map = new HashMap<Integer, String> ();
		
		map.put(new Integer(100), "멋쟁이");
		map.put(new Integer(300), "공주");
		map.put(new Integer(200), "왕자");

		System.out.println(map.get(100));
		System.out.println(map.get(200));
		System.out.println(map.get(300));
		
//		map.remove(200);
		System.out.println(map.size());
		
		Set <Integer> set = map.keySet();
		
		for(Integer i:set) {
			System.out.println(i + "\t" + map.get(i));
		}
		
	}

}
