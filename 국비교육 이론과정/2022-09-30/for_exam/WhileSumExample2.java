package for_exam;

import java.util.*;

public class WhileSumExample2 {
	public static void main(String[] args) {
		// while �ݺ����� ����Ͽ� 1 ���� �Է¹��� n ������ �� ���ϱ�
		int i = 1;
		int sum = 0;
		System.out.print("���� n�� �Է��ϼ���. >> ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (i <= n) {
			sum += i;
			i++;
			
		}
		System.out.println("1 ���� " + n + " ������ �� : " + sum);
	}
}
