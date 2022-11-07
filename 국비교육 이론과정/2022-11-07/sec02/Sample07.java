package sec02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample07 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		// 반복자 얻기
		Iterator<String> it = list.iterator();
		while(it.hasNext()) { // 반복할 요소가 있다면
			System.out.println(it.next());
		}
		
		// 1회 반복을 수행한 반복자 객체는 더 이상 반복되지 않는다.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 반복을 수행하려면 반복자를 다시 얻어야함.
		it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
