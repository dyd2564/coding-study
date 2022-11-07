package sec01;

import java.util.ArrayList;
import java.util.List;

public class Sample05 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.remove(1);
		System.out.println(list);
		
		list.remove(new Integer(3));
		System.out.println(list);
	}
}
