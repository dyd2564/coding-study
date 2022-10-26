package exam05;

import java.util.*;

public class MemberDao2 {
	public static void main(String[] args) {
		
		String[] strArr = {"홍길동", "박길동", "나길동"};
//		List<String> strList = {"홍길동", "박길동", "나길동"};
		List<String> strList = Arrays.asList("홍길동", "박길동", "나길동");
		System.out.println(strList);
		
		int[] intArr = {1, 2, 3, 4, 5};
		// int의 Wrapper 클래스 : Integer
		// long의 Wrapper 클래스 : Long
		// double의 Wrapper 클래스 : Double
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		intList = new ArrayList<Integer>(intList);
		System.out.println(intList);
		
		// 길이
		System.out.println("배열의 길이 : " + intArr.length);
		System.out.println("리스트의 길이 : " + intList.size());
		
		int[] result = new int[intList.size()];
		
		for (int i = 0; i < intList.size(); i++) {
			result[i] = intList.get(i); // intArr[i]
		}
		System.out.println(Arrays.toString(result));
		
		// 삭제
		intList.remove(2);
		System.out.println(intList);
		result[2] = 0;
		System.out.println(Arrays.toString(result));
	}
}
