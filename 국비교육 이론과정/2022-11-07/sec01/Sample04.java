package sec01;

import java.util.ArrayList;
import java.util.List;

public class Sample04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		// �ε��� ��ȣ�� ����
		list.remove(1); // kiwi ����
		System.out.println(list);
		
		// ������ ��ü ����
		list.remove("apple");
		System.out.println(list);
		
		// ����Ʈ�� ����ִ��� Ȯ�� -> boolean Ÿ��
		System.out.println(list.isEmpty());
		
		// ����Ʈ�� ��� ��ü ����
		list.clear();
		System.out.println(list.isEmpty());
	}
}
