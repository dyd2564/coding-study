package for_exam;

import java.util.*;

public class ForSumExample2 {
	public static void main(String[] args) {
		
		// 1 ���� �Է¹��� ���� n������ �� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���. >> ");
		int sum = 0;
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) { // i++ ��ſ� i = i + 1 �ᵵ ������.
			sum += i;
		}
		System.out.println("1 ���� " + n + "������ ���� : " + sum);
	}
}
