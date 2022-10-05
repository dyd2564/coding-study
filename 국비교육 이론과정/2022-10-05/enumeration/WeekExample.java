package enumeration;

public class WeekExample {
	public static void main(String[] args) {
		
		Week week = Week.SUNDAY;
		// name() 이름
		String weekName = week.name();
		System.out.println(weekName);  // name 메소드 사용
		System.out.println(week);	   // 그냥 추력
		
		// ordinal() 순번
		int weekOrd = week.ordinal();
		System.out.println(weekOrd);
		System.out.println(Week.FRIDAY.ordinal());
		
		// 열거 객체 비교
		Week day1 = Week.MONDAY;    // 1
		Week day2 = Week.WEDNESDAY; // 3
		// 상대적 위치 인수(기준)
		// day1은 day2를 기준으로 어디에 위치해있는가
		int pos1 = day1.compareTo(day2);
		// day2를 기준으로 왼쪽으로 2칸 떨어져있다.
		System.out.println(pos1); // -2
		
		// day2은 day1를 기준으로 어디에 위치해있는가
		int pos2 = day2.compareTo(day1);
		System.out.println(pos2); // 2
	}
}
