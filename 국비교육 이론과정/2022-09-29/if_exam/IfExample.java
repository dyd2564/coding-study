package if_exam;

import java.util.*;

public class IfExample {
	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ���. >> ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("������ 90�� �̻��Դϴ�.");
			System.out.println("����� A��� �Դϴ�.");
			
		} else {
			System.out.println("������ 90�� �̸��Դϴ�.");
			System.out.println("����� B��� �Դϴ�.");
		}
		
	}
}
