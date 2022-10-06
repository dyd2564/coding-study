package section2.exam04;

public class StringCalculatorExample {
	public static void main(String[] args) {
		StringCalculator cal = new StringCalculator();
		
		int result1 = cal.add(10, 2);
		System.out.println(result1);
		
		// 올바른 값을 입력했을 경우
		int result2 = cal.add("10", "2");
		System.out.println(result2);
		
		// 숫자로 변활할 수 없는 문자열을 입력한 경우
		int result3 = cal.add("abcd", "2"); // NumberFormatException 예외 발생
		// StringCalcultaor.java 에서 try ~ catch문을 이용하여 처리
		System.out.println(result3);
	}
}
