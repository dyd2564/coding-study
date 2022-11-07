package sec01;

import java.util.ArrayList;
import java.util.List;

public class Sample03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		System.out.println(list);
		
		// 지정된 위치에 값 추가
		list.add(2, "MELON");
		System.out.println(list);
		
		// 지정된 위치 값 수정
		list.set(0, "사과");
		System.out.println(list);
	}
}
