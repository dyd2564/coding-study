package scanner_exam;

import java.util.*;

public class LogicOperatorExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("별명을 입력하세요 >> ");
		String nickName = sc.nextLine();
		
		boolean minTest = nickName.length() >= 3;
		boolean maxTest = nickName.length() <= 5;
		
		if (minTest && maxTest) { // AND 연산자 (둘 다 참일 때 if 블록 실행)
			System.out.println("별명이 입력되었습니다.");
			System.out.println("입력된 별명은 " + nickName + " 입니다.");
			return; // 현재 메소드 종료
		} // 둘 중 하나라도 거짓일 때 밑에 프린트 함수 실행
		System.out.println("입력된 별명은 총 " + nickName.length() + "글자입니다.");
		System.out.println("별명은 3글자이상 5글자이하로 입력해주세요.");
	}
}
