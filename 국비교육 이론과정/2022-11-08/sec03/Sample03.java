package sec03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sample03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("appe");
		list.add("kiwis");
		list.add("gra");
		list.add("bananasddsa");
		list.add("orangeew");
		
		// ������ ������� ����
		// ���ڿ� ���� ��������
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
		System.out.println(list);
		
		// ���ڿ� ���� ��������
		list.sort((o1,o2)-> {
			return o2.length()-o1.length();
		});
		System.out.println(list);
		
		// ���ڿ� ���� ��������
		// �ڵ尡 ������ ��� return�� �߰�ȣ�� ������ �� �ִ�.
		// return�� �����ϸ� �߰�ȣ�� �ݵ�� �����ؾ���.
		list.sort((o1,o2)-> o1.length()-o2.length());
	}
}
