package sec02;

import java.util.ArrayList;
import java.util.List;

public class Sample01 {
	public static void main(String[] args) {
		// addAll()
		List<String> list1 = new ArrayList<String>();
		list1.add("zz");
		list1.add("cc");
		list1.add("bb");
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("11");
		list2.add("22");
		list2.add("33");
		System.out.println(list2);
		
		// list1에 매개값으로 주어진 컬렉션의 모든 요소 추가
		// 매개변수 타입 : Collection(List, Set)
		// Collection<? extends E>
		// ? : 와일드 카드
		// E : String 타입으로 결정된다.
		// Collection<? extends String>
		// 화일드 카드로 전달할 수 있는 타입변수는 String 또는 String 상속(구현)타입
		list1.addAll(list2);
		System.out.println(list1);
		
		// Collection<? extends Number>
		// Collection<Number> : ok!
		// Collection<Integer> : ok!
		// Collection<Double> : ok!
		// Collection<String> : 컴파일 에러 
		
		
		// 원하는 인덱스 위치에 요소 추가
		List<String> list3 = new ArrayList<String>();
		list3.add("가");
		list3.add("나");
		list1.addAll(2, list3);
		System.out.println(list1);
		
	}
}
