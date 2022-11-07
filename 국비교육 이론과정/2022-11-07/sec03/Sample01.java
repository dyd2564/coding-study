package sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class Sample01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
//		String[] array2 = (String[]) list.toArray();
		
		String[] strArr = list.toArray(new String[0]);
		System.out.println(Arrays.toString(strArr));
		
		String[] array2 = list.toArray(new IntFunction<String[]>() {
			@Override
			public String[] apply(int value) {
				return new String[value];
			}
		});
		System.out.println(Arrays.toString(array2));
				
	}
}
