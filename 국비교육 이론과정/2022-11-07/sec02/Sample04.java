package sec02;

import java.util.ArrayList;
import java.util.List;

public class Sample04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("apple");
		list.add("orange");

		System.out.println(list);
		
		// ����� ��ü�� �ε��� ��ȯ : �ش� ��ü�� ������ -1 ��ȯ
		System.out.println(list.indexOf("apple")); // �� -> �� (���� �߰� �ε��� ��ȯ)
		System.out.println(list.indexOf("melon"));
		
		System.out.println(list.lastIndexOf("apple")); // �� -> �� (���� �߰� �ε��� ��ȯ)
		
		// ��ü�� ���ԵǾ� �ִ��� ����
		if(list.contains("apple")) {
			System.out.println("����� ���ԵǾ� ����");
		}
		if(list.contains("melon")) {
			System.out.println("����� ���ԵǾ� ����");
		} else {
			System.out.println("����� �������� ����");
		}
		
	}
}
