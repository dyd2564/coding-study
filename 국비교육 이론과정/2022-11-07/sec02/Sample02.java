package sec02;

import java.util.ArrayList;
import java.util.List;

public class Sample02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(List.of("a", "b", "c", "b", "e"));
		List<String> param = new ArrayList<String>(List.of("b", "c", "k"));
		System.out.println(list);
		System.out.println(param);
		list.removeAll(param);
		System.out.println(list);
	}
}
