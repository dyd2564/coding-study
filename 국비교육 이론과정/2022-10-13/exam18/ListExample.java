package exam18;

import java.util.*;

public class ListExample {
	public static void main(String[] args) {
		
		// List �������̽�
		// ����Ŭ���� : ArrayList, LinkedList
		List<String> list = new ArrayList<String>();
		list.add("��浿");
		list.add("�Ѹ�");
		list.add("��");
		list.add("�����");
		System.out.println(list);
		list.remove("�����"); // String ����
		System.out.println(list);
		list.remove(0); // �ε��� ����
		System.out.println(list);
	}
}
