package while_exam;

import java.util.*;

public class DoWhileExample {
	public static void main(String[] args) {
		
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print("�޼����� �Է��ϼ��� : ");
			inputString = sc.nextLine();
			System.out.println("�Է��� �� : " + inputString);
			
		} while (!inputString.equals("q"));
		System.out.println("���α׷��� �����մϴ�.");
	}
}
