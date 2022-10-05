package enumeration;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week day = null;
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1:
			day = Week.SUNDAY;
			break;
		case 2:
			day = Week.MONDAY;
			break;
		case 3:
			day = Week.TUESDAY;
			break;
		case 4:
			day = Week.WEDNESDAY;
			break;
		case 5:
			day = Week.THURSDAY;
			break;
		case 6:
			day = Week.FRIDAY;
			break;
		case 7:
			day = Week.SATURDAY;
			break;	
		}
		System.out.println("������ " + day + " �Դϴ�.");
		
		if (day == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		} else {
			System.out.println("������ �ڹ� ���θ� �մϴ�.");
		}
	}
}
