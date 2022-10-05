package enumeration;

public class WeekExample {
	public static void main(String[] args) {
		
		Week week = Week.SUNDAY;
		// name() �̸�
		String weekName = week.name();
		System.out.println(weekName);  // name �޼ҵ� ���
		System.out.println(week);	   // �׳� �߷�
		
		// ordinal() ����
		int weekOrd = week.ordinal();
		System.out.println(weekOrd);
		System.out.println(Week.FRIDAY.ordinal());
		
		// ���� ��ü ��
		Week day1 = Week.MONDAY;    // 1
		Week day2 = Week.WEDNESDAY; // 3
		// ����� ��ġ �μ�(����)
		// day1�� day2�� �������� ��� ��ġ���ִ°�
		int pos1 = day1.compareTo(day2);
		// day2�� �������� �������� 2ĭ �������ִ�.
		System.out.println(pos1); // -2
		
		// day2�� day1�� �������� ��� ��ġ���ִ°�
		int pos2 = day2.compareTo(day1);
		System.out.println(pos2); // 2
	}
}
