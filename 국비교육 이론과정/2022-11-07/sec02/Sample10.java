package sec02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Sample10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		Iterator<String> it = list.iterator();
		// ���ڿ� "e"�� ������ �� ����
		while(it.hasNext()) {
			if(it.next().endsWith("e")) it.remove();
		}
		System.out.println(list);
		
	}
}
