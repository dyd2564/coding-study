package for_exam;

import java.util.*;

public class GugudanExample2 {
	public static void main(String[] args) {
		// 입력 받은 숫자 n의 구구단 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 n을 입력하세요. >> ");
		
		int n = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i  + " = " + n*i );
		}
	}
		
}
