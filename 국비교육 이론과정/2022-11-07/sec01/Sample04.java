package sec01;

import java.util.ArrayList;
import java.util.List;

public class Sample04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		// 인덱스 번호로 삭제
		list.remove(1); // kiwi 삭제
		System.out.println(list);
		
		// 지정한 객체 삭제
		list.remove("apple");
		System.out.println(list);
		
		// 리스트가 비어있는지 확인 -> boolean 타입
		System.out.println(list.isEmpty());
		
		// 리스트의 모든 객체 삭제
		list.clear();
		System.out.println(list.isEmpty());
	}
}
