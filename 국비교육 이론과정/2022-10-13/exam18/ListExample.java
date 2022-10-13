package exam18;

import java.util.*;

public class ListExample {
	public static void main(String[] args) {
		
		// List 인터페이스
		// 구현클래스 : ArrayList, LinkedList
		List<String> list = new ArrayList<String>();
		list.add("고길동");
		list.add("둘리");
		list.add("희동");
		list.add("도우너");
		System.out.println(list);
		list.remove("도우너"); // String 삭제
		System.out.println(list);
		list.remove(0); // 인덱스 삭제
		System.out.println(list);
	}
}
