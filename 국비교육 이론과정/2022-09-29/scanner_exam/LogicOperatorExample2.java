package scanner_exam;

import java.util.*;

public class LogicOperatorExample2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� >> ");
		String nickName = sc.nextLine();
		
		boolean minTest = nickName.length() >= 3;
		boolean maxTest = nickName.length() <= 5;
		
		if (minTest || maxTest) { // OR ������ (�� �� �ϳ��� ���� �� if ��� ����)
			System.out.println("�Էµ� ������ �� " + nickName.length() + "�����Դϴ�.");
			System.out.println("������ 3�����̻� 5�������Ϸ� �Է����ּ���.");
			return; // ���� �޼ҵ� ����
		} 
		System.out.println("������ �ԷµǾ����ϴ�.");
		System.out.println("�Էµ� ������ " + nickName + " �Դϴ�.");
	}
}
