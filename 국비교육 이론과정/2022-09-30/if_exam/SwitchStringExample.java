package if_exam;

import java.util.*;

public class SwitchStringExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직위를 입력하세요. >> ");
		String position = sc.nextLine();
		
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
		default:
			System.out.println("300만원");
			break;
		}
	}
}
