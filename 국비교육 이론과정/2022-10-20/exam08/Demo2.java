package exam08;

public class Demo2 {
	public static void main(String[] args) {
		// NumberFormatException
		// 문자열 -> 숫자
		int result1 = Integer.parseInt("123");
		int result2 = Integer.parseInt("111");
		System.out.println(result1 + result2);
		
		
		try {
			// 예외발생 -> 프로그램 종료
//			Integer.parseInt("12_34SSS"); // NumberFormatException
			
		} catch (NumberFormatException e) {
			System.out.println("잘못된 입력 값");
		}
		System.out.println("메인메소드 종료");
		
		
	}
}
