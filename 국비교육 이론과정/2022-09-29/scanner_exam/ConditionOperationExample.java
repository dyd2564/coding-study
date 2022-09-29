package scanner_exam;

import java.util.*;

public class ConditionOperationExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. >> ");
		int score = sc.nextInt();
		
		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println(result);
	}
}
