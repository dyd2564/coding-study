package if_exam;

import java.util.*;

public class IfExample3 {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요. >> ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("점수는 90점 이상입니다.");
			System.out.println("등급은 A등급 입니다.");
		} else if (score >= 80) {
			System.out.println("점수는 80점 이상 90점 미만입니다.");
			System.out.println("등급은 B등급 입니다.");
		} else if (score >= 70) {
			System.out.println("점수는 70점 이상 80점 미만입니다.");
			System.out.println("등급은 C등급 입니다.");
		} else {
			System.out.println("점수는 70점 미만입니다.");
			System.out.println("등급은 D등급 입니다.");
		}
		System.out.println("메인 메소드 종료.");
		
		
	

	}
}
