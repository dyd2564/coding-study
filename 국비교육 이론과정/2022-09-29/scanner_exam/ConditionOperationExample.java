package scanner_exam;

import java.util.*;

public class ConditionOperationExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. >> ");
		int score = sc.nextInt();
		
		String result = (score >= 60) ? "�հ�" : "���հ�";
		System.out.println(result);
	}
}
