package while_exam;

import java.util.*;

public class BreakExample2 {
	public static void main(String[] args) {
		
		int num = 0; // �Է�
		int sum = 0; // �հ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0�� �Է��ϸ� ����.");
		
		while(true) {
			System.out.print("���� �� �Է� >> ");
			num = sc.nextInt();
			if(num == 0) break; // 0�� �Է��ϸ� while�� Ż��
			sum += num;
			System.out.println("�հ� : " + sum);
		}
		
		System.out.println("���α׷� ����.");
	}
}

