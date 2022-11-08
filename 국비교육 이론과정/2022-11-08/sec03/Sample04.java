package sec03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		// 문자열 : 사전역순, 숫자 : 내림차순
		list.sort(Collections.reverseOrder());
	}
}
