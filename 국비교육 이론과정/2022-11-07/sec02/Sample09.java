package sec02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Sample09 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		// Consumer<? extends String>
		// String �Ǵ� String Ÿ���� ���(����)�� Ŭ����Ÿ��
		// Consumer<? super String>
		// String �Ǵ� String Ÿ���� ����Ŭ���� �Ǵ� �������̽� 
		// @FunctionalInterface : �߻�޼ҵ尡 �ϳ��� �������̽�, ���ٽ����� ǥ���� �� ����
		Iterator<String> it = list.iterator();
		
		it.forEachRemaining(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t.length());
			}

		});
		
		// ���ٽ�
		System.out.println("============���ٽ�============");
		it = list.iterator();
		it.forEachRemaining(t -> System.out.println(t));
		
		// �޼ҵ� ����
		System.out.println("===========�޼ҵ�============");
		it = list.iterator();
		it.forEachRemaining(System.out::println);
	}
}
