package scanner_exam;

import java.util.*;

public class CompareOperatorExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° �� �Է� >> ");
		int inputInt1 = sc.nextInt();
		
		System.out.print("�� ��° �� �Է� >> ");
		int inputInt2 = sc.nextInt();
		
		if (inputInt1 == inputInt2) {
			System.out.println("�� �Է°��� ����.");
		}
		
		if (inputInt1 != inputInt2) {
			System.out.println("�� �Է°��� ���� �ٸ���.");
		}
		
		if (inputInt1 > inputInt2) {
			System.out.println("ù ��° �Է°��� �� ũ��.");
		}
		
		if (inputInt1 < inputInt2) {
			System.out.println("�� ��° �Է°��� �� ũ��.");
		}
	}
}
