package for_exam;

import java.util.*;

public class ForSumExample2 {
	public static void main(String[] args) {
		
		// 1 부터 입력받은 숫자 n까지의 합 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. >> ");
		int sum = 0;
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) { // i++ 대신에 i = i + 1 써도 무방힘.
			sum += i;
		}
		System.out.println("1 부터 " + n + "까지의 합은 : " + sum);
	}
}
