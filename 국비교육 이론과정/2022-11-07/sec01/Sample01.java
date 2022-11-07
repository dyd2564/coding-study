package sec01;

import java.util.ArrayList;

public class Sample01 {
	/* 
		List인터페이스 : ArrayList
		저장순서 유지, 중복 허용
	*/
	
	public static void main(String[] args) {
		// 제네릭을 지정하지 않으면 모든 자료를 추가할 수 있음
		ArrayList list = new ArrayList();
		boolean add = list.add(5);
		System.out.println("객체 추가 : " + add);
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add("abc");
		System.out.println(list);
		
		// 제네릭 타입을 지정하지 않으면 Object타입으로 받아온다.
		Object object = list.get(3);
		int idx0 = (int) list.get(0); // 타입캐스팅 필요
		int idx1 = (int) list.get(1); // 타입캐스팅 필요
		System.out.println(idx0 + idx1);
	}
}
