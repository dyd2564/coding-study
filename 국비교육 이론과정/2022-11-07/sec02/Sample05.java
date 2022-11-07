package sec02;

import java.util.ArrayList;
import java.util.List;

public class Sample05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		// list.clone();
		ArrayList<String> clone = (ArrayList<String>)((ArrayList<String>)list).clone();
		System.out.println(clone);
		
		List<String> copy = new ArrayList<String>(list);
		System.out.println(copy);
		
	}
}
