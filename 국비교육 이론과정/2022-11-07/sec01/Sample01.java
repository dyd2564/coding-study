package sec01;

import java.util.ArrayList;

public class Sample01 {
	/* 
		List�������̽� : ArrayList
		������� ����, �ߺ� ���
	*/
	
	public static void main(String[] args) {
		// ���׸��� �������� ������ ��� �ڷḦ �߰��� �� ����
		ArrayList list = new ArrayList();
		boolean add = list.add(5);
		System.out.println("��ü �߰� : " + add);
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add("abc");
		System.out.println(list);
		
		// ���׸� Ÿ���� �������� ������ ObjectŸ������ �޾ƿ´�.
		Object object = list.get(3);
		int idx0 = (int) list.get(0); // Ÿ��ĳ���� �ʿ�
		int idx1 = (int) list.get(1); // Ÿ��ĳ���� �ʿ�
		System.out.println(idx0 + idx1);
	}
}
