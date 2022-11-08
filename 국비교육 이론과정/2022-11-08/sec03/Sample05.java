package sec03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		System.out.println(list);
		Collections.rotate(list, 1);
		System.out.println(list);
		
		Collections.rotate(list, 2);
		System.out.println(list);
		
		Collections.rotate(list, -1);
		System.out.println(list);
		
		// 두 요소의 위치 바꾸기
		Collections.swap(list, 1, 4);
		System.out.println(list);
		
		// 모든 요소 위치 랜덤으로 바꾸기
		Collections.shuffle(list);
		System.out.println(list);
	}
}
