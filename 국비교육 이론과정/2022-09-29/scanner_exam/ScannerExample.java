package scanner_exam;

import java.util.*;

public class ScannerExample {
	public static void main(String[] args) {
		
		// ������Ÿ�� ������ - ����(primitive)Ÿ��
//		int value = 11; // ���� ����
		
		// ������Ÿ�� : Scanner ������ : sc - ����(reference)Ÿ��
//		Scanner sc; // ���� ����
		
		// new �����ڸ� ���� ��ĳ�� ��ü ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : "); // : �ڿ� �ٷ� �Է��ϱ� ���ؼ� ���๮��(ln) �Է�x
		String inputValue = sc.nextLine();
		System.out.println("�Է��� �� : " + inputValue);
		
		/*
		 * int inputValue1 = sc.nextInt(); // ���ڿ� �Է½� Ÿ�� �̽���ġ ���� �߻�
		 * System.out.println("�Է��� �� : " + inputValue1);
		 */
		
		System.out.println("���� ����");
	}
}
