package enumeration;

import java.util.*;

public class EnumMethodExample {
	public static void main(String[] args) {
		
		Week[] weeks = Week.values();
		System.out.println(weeks.length);
		System.out.println(Arrays.toString(weeks));
		
		for (int i = 0; i < weeks.length; i++) {
			System.out.print(weeks[i] + ",");
		}
		System.out.println();
		
		for (Week w : weeks) {
			System.out.print(w + ",");
		}
		System.out.println();
		Week day1 = Week.valueOf("SUNDAY");
		System.out.println(day1);
		// ��ҹ��� ����, ������ ���ܹ߻� : IllegalArgumentException
//		Week day2 = Week.valueOf("sunday");
//		System.out.println(day2);
		
		Week weekDay = Week.valueOf("SUNDAY"); // SUNDAY ���Ż�� �Ҵ�
		if (weekDay == Week.SUNDAY || weekDay == Week.SATURDAY) {
			System.out.println("�ָ��̱���.");
		} else {
			System.out.println("�����̱���.");
		}
	}
}
