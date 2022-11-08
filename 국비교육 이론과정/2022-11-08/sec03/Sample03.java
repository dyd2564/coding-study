package sec03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sample03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("appe");
		list.add("kiwis");
		list.add("gra");
		list.add("bananasddsa");
		list.add("orangeew");
		
		// 지정된 방법으로 정렬
		// 문자열 길이 오름차순
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
		System.out.println(list);
		
		// 문자열 길이 내림차순
		list.sort((o1,o2)-> {
			return o2.length()-o1.length();
		});
		System.out.println(list);
		
		// 문자열 길이 오름차순
		// 코드가 한줄인 경우 return과 중괄호를 생략할 수 있다.
		// return을 생략하면 중괄호를 반드시 생략해야함.
		list.sort((o1,o2)-> o1.length()-o2.length());
	}
}
