package scanner_exam;

import java.util.*;

public class ValueOfExample2 {
	public static void main(String[] args) {
		
		System.out.print("금액을 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
		
		String inputValue = sc.nextLine();
		
		double val = Double.valueOf(inputValue);
		
		double currentBalance = 1000.0;
		System.out.println(val + "원 입금");
		currentBalance += val;
		System.out.println("잔액 : " + currentBalance);
		
		
		
	}
}
