package if_exam;

import java.util.*;

public class IfNestedExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. >> ");
		
		int score = sc.nextInt();
		String grade = null;
		
		if (score >= 90) {
//			grade = score > = 95 ? "A+" : "A" ;
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
			
		} else {
//			grade = score > = 85 ? "B+" : "B" ;
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점 : " + grade);
	
	}
}
