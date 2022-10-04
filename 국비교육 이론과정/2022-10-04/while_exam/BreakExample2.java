package while_exam;

import java.util.*;

public class BreakExample2 {
	public static void main(String[] args) {
		
		int num = 0; // 입력
		int sum = 0; // 합계
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0을 입력하면 종료.");
		
		while(true) {
			System.out.print("정수 값 입력 >> ");
			num = sc.nextInt();
			if(num == 0) break; // 0을 입력하면 while문 탈출
			sum += num;
			System.out.println("합계 : " + sum);
		}
		
		System.out.println("프로그램 종료.");
	}
}

