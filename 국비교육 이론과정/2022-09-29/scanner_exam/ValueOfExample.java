package scanner_exam;

import java.util.*;

public class ValueOfExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String value1 = "1000";
		String value2 = "2000";
		System.out.println(value1 + value2); // 문자열 연결 10002000
		
		double dValue1 = Double.valueOf(value1);
		double dValue2 = Double.valueOf(value2);
		System.out.println(dValue1 + dValue2); // 3000.0
		
		int iValue1 = Integer.valueOf(value1);
		int iValue2 = Integer.valueOf(value2);
		System.out.println(iValue1 + iValue2); // 3000
		
		String hello = "Hello";
		try {
			int iHello = Integer.valueOf(hello); // NumberFormatException 예외 발생
		} catch (Exception e) {
			System.out.println("숫자로 바꿀수 없음");
		}
		System.out.println("메인 끝");
	}
}
