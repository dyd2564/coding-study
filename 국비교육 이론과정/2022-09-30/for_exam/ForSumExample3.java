package for_exam;

import java.util.*;

public class ForSumExample3 {
	public static void main(String[] args) {
		
		// 1 ���� �Է¹��� ���� n������  Ȧ�� �� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���. >> ");
		int sum = 0;
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i=i+2) { 
			sum += i;
		}
		System.out.println("1 ���� " + n + "������ Ȧ�� ���� : " + sum);
	}
}
