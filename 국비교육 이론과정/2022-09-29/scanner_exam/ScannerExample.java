package scanner_exam;

import java.util.*;

public class ScannerExample {
	public static void main(String[] args) {
		
		// 데이터타입 변수명 - 원시(primitive)타입
//		int value = 11; // 변수 선언
		
		// 데이터타입 : Scanner 변수명 : sc - 참조(reference)타입
//		Scanner sc; // 변수 선언
		
		// new 연산자를 통해 스캐너 객체 새성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력하세요 : "); // : 뒤에 바로 입력하기 위해서 개행문자(ln) 입력x
		String inputValue = sc.nextLine();
		System.out.println("입력한 값 : " + inputValue);
		
		/*
		 * int inputValue1 = sc.nextInt(); // 문자열 입력시 타입 미스매치 오류 발생
		 * System.out.println("입력한 값 : " + inputValue1);
		 */
		
		System.out.println("메인 종료");
	}
}
