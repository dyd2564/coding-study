package sec02;

import java.util.ArrayList;
import java.util.List;

public class Sample06 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		System.out.println(list.subList(1, 3));		

		List<String> list2 = list.subList(0, list.size());
		System.out.println(list2);
		
	}
}
