package enumeration;

import java.util.*;

public class CalenderExample {
	public static void main(String[] args) {
		
		// ��ü ���� : new ������
		String str = new String("ȫ�浿"); // ���ڿ� ��ü ����
		
		// ������� �� ������ ���� �� : new �����ڸ� ���ؼ� ��ü���� �Ұ���
		Calendar now = Calendar.getInstance();
//		System.out.println(now);
		// now.get(1) ����
		// now.get(2) ��
		int year = now.get(Calendar.YEAR);
		System.out.println("���� : " + year);
		
		int month = now.get(Calendar.MONTH) + 1;  
		System.out.println("�� : " + month);
		
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println("�� : " + day);
		
		int hour = now.get(Calendar.HOUR);
		System.out.println("�ð� : " + hour);
		
		int min = now.get(Calendar.MINUTE);
		System.out.println("�� : " + min);
		
		int sec = now.get(Calendar.SECOND);
		System.out.println("�� : " + sec);
		
		int day1 = now.get(Calendar.DAY_OF_WEEK);
		// �� : 1, �� : 2, ȭ : 3, �� : 4, �� : 5, �� : 6, �� : 7
		System.out.println("���� : " + day1);
		
		System.out.println("���� �ð� : " + hour + "�� " + min + "�� " + sec + "�� ");
	}
}
