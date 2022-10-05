package enumeration;

import java.util.*;

public class CalenderExample {
	public static void main(String[] args) {
		
		// 객체 생성 : new 연산자
		String str = new String("홍길동"); // 문자열 객체 생성
		
		// 만들어진 것 가져다 쓰는 것 : new 연산자를 통해서 객체생성 불가능
		Calendar now = Calendar.getInstance();
//		System.out.println(now);
		// now.get(1) 연도
		// now.get(2) 월
		int year = now.get(Calendar.YEAR);
		System.out.println("연도 : " + year);
		
		int month = now.get(Calendar.MONTH) + 1;  
		System.out.println("월 : " + month);
		
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println("일 : " + day);
		
		int hour = now.get(Calendar.HOUR);
		System.out.println("시간 : " + hour);
		
		int min = now.get(Calendar.MINUTE);
		System.out.println("분 : " + min);
		
		int sec = now.get(Calendar.SECOND);
		System.out.println("초 : " + sec);
		
		int day1 = now.get(Calendar.DAY_OF_WEEK);
		// 일 : 1, 월 : 2, 화 : 3, 수 : 4, 목 : 5, 금 : 6, 토 : 7
		System.out.println("요일 : " + day1);
		
		System.out.println("현재 시간 : " + hour + "시 " + min + "분 " + sec + "초 ");
	}
}
