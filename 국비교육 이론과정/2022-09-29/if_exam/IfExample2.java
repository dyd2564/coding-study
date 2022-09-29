package if_exam;

import java.util.*;

public class IfExample2 {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요. >> ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		ifElseTest(score);
		
		
	}

	private static void ifElseTest(int score) {
		if (score >= 90) {
			System.out.println("점수는 90점 이상입니다.");
			System.out.println("등급은 A등급 입니다.");
			return;
		}
		System.out.println("점수는 90점 미만입니다.");
		System.out.println("등급은 B등급 입니다.");
		
	}
}
