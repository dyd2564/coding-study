package sec03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample06 {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(13);
		intList.add(9);
		intList.add(15);
		intList.add(11);
		
		int max = Collections.max(intList);
		int min = Collections.min(intList);
		System.out.println(max);
		System.out.println(min);
		
		List<String> list = new ArrayList<String>();
		list.add("kiwi");
		list.add("banana");
		list.add("grape");
		list.add("apple");
		list.add("orange");
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
	}
}
