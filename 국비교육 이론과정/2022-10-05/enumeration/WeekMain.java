package enumeration;

public class WeekMain {
	public static void main(String[] args) {
		
		// Week today = Week.Monday;
		Week today; // 열거타입 선언
		today = Week.MONDAY; // 열거 상수 할당
		// today 스택 영역
		// Week.MONDAY 메소드 영역 (공유)
		// MONDAY 열거객체 (힙 영역)
		
		System.out.println(today);
		
		Week birthday = null;
	}
}
