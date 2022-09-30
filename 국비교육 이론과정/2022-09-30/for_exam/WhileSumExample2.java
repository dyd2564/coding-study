package for_exam;

import java.util.*;

public class WhileSumExample2 {
	public static void main(String[] args) {
		// while 반복문을 사용하여 1 부터 입력받은 n 까지의 합 구하기
		int i = 1;
		int sum = 0;
		System.out.print("숫자 n을 입력하세요. >> ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (i <= n) {
			sum += i;
			i++;
			
		}
		System.out.println("1 부터 " + n + " 까지의 합 : " + sum);
	}
}
