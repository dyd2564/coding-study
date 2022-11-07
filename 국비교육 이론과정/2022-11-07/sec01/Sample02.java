package sec01;

import java.util.ArrayList;

public class Sample02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("자바");
		list.add("오라클");
		list.add("JSP");
		list.add("스프링");
		list.add("통합구현");
		System.out.println(list);
		
		// 컬렉션의 크기
		System.out.println("컬렉션의 크기 : " + list.size());
		
		// 지정된 제네릭 타입으로 받아온다.
		// 타입캐스팅이 필요하지 않다.
		String str = list.get(0);
//		list.add('a');
//		list.add(10);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
