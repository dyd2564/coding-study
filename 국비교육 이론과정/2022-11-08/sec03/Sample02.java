package sec03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		Collections.reverse(list);
		System.out.println(list);
		
		// �⺻���� - ���ڿ� : ������, ���� : ��������
		Collections.sort(list);
		System.out.println(list);
	}
}
