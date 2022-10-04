package while_exam;

import java.util.*;

public class DoWhileExample {
	public static void main(String[] args) {
		
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print("메세지를 입력하세요 : ");
			inputString = sc.nextLine();
			System.out.println("입력한 값 : " + inputString);
			
		} while (!inputString.equals("q"));
		System.out.println("프로그램을 종료합니다.");
	}
}
