package scanner_exam;

import java.util.*;

public class LogicOperatorExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� >> ");
		String nickName = sc.nextLine();
		
		boolean minTest = nickName.length() >= 3;
		boolean maxTest = nickName.length() <= 5;
		
		if (minTest && maxTest) { // AND ������ (�� �� ���� �� if ��� ����)
			System.out.println("������ �ԷµǾ����ϴ�.");
			System.out.println("�Էµ� ������ " + nickName + " �Դϴ�.");
			return; // ���� �޼ҵ� ����
		} // �� �� �ϳ��� ������ �� �ؿ� ����Ʈ �Լ� ����
		System.out.println("�Էµ� ������ �� " + nickName.length() + "�����Դϴ�.");
		System.out.println("������ 3�����̻� 5�������Ϸ� �Է����ּ���.");
	}
}
