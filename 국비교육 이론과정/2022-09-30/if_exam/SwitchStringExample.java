package if_exam;

import java.util.*;

public class SwitchStringExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. >> ");
		String position = sc.nextLine();
		
		switch (position) {
		case "����":
			System.out.println("700����");
			break;
		case "����":
			System.out.println("500����");
		default:
			System.out.println("300����");
			break;
		}
	}
}
