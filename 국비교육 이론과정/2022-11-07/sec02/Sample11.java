package sec02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Sample11 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		ListIterator<String> it = list.listIterator();
		System.out.println("다음 요소 반복");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("이전 요소 반복");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		System.out.println("==================");
		while(it.hasNext()) {
			System.out.println(it.next());
			System.out.println(it.nextIndex());
		}
		
		it = list.listIterator();
		String[] strArr = new String[list.size()];
		while(it.hasNext()) {
			strArr[it.nextIndex()] = it.next();
		}
		System.out.println(Arrays.toString(strArr));
	}
}
