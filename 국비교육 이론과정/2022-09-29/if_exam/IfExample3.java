package if_exam;

import java.util.*;

public class IfExample3 {
	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ���. >> ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("������ 90�� �̻��Դϴ�.");
			System.out.println("����� A��� �Դϴ�.");
		} else if (score >= 80) {
			System.out.println("������ 80�� �̻� 90�� �̸��Դϴ�.");
			System.out.println("����� B��� �Դϴ�.");
		} else if (score >= 70) {
			System.out.println("������ 70�� �̻� 80�� �̸��Դϴ�.");
			System.out.println("����� C��� �Դϴ�.");
		} else {
			System.out.println("������ 70�� �̸��Դϴ�.");
			System.out.println("����� D��� �Դϴ�.");
		}
		System.out.println("���� �޼ҵ� ����.");
		
		
	

	}
}
