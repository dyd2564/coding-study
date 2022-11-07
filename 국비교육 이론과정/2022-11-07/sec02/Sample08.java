package sec02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample08 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		Iterator<String> it = list.iterator();
		System.out.println(it.hasNext());
		System.out.println(it.next()); // 다음 요소 : apple
		System.out.println(it.hasNext());
		System.out.println(it.next()); // 다음 요소 : kiwi
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
	}
}
