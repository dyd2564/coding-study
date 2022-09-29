package scanner_exam;

import java.util.*;

public class ValueOfExample3 {
	public static void main(String[] args) {
		
		System.out.print("금액을 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
		
		String inputValue = sc.nextLine();
		
		try {
			double val = Double.valueOf(inputValue); // NaN 가능성 있음.
//			System.out.println(val==Double.NaN); // 참조비교
//			System.out.println(Double.isNaN(val)); // 실제 값 비교
//			!= 와 == 는 참조비교로써 주소 값 동일여부 판단임!!!!!!!!!!!!!
//			if (val != Double.NaN) { // 이 if 문으로 실행 시 참조 비교함으로 올바른 값 안 나옴.
			if (!Double.isNaN(val)) {
				double currentBalance = 1000.0;
				System.out.println(val + "원 입금");
				currentBalance += val;
				System.out.println("잔액 : " + currentBalance);
				return;
			}
			System.out.println("NaN : 올바른 입력값이 아닙니다.");
		} catch (Exception e) {
			System.out.println("예외발생 : 올바른 입력값이 아닙니다.");
		}
		
		
		
	}
}
