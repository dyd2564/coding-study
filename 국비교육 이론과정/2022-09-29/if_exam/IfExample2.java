package if_exam;

import java.util.*;

public class IfExample2 {
	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ���. >> ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		ifElseTest(score);
		
		
	}

	private static void ifElseTest(int score) {
		if (score >= 90) {
			System.out.println("������ 90�� �̻��Դϴ�.");
			System.out.println("����� A��� �Դϴ�.");
			return;
		}
		System.out.println("������ 90�� �̸��Դϴ�.");
		System.out.println("����� B��� �Դϴ�.");
		
	}
}
