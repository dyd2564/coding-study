package sec02;

import java.util.ArrayList;
import java.util.List;

public class Sample03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(List.of("a", "b", "c", "d", "e"));
		List<String> param = new ArrayList<String>(List.of("z", "b", "f", "c"));
		// 공통 요소
		list.retainAll(param);
		System.out.println(list);
	}
}
