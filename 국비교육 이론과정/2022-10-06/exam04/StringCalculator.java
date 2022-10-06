package section2.exam04;

public class StringCalculator {
	
	int add(int a, int b) {
		return a + b;
	}
	
	int add(String a, String b) {
		int num1 = 0;
		int num2 = 0;
		try {
			num1 = Integer.parseInt(a);
			num2 = Integer.parseInt(b);
		} catch (NumberFormatException e) {
			System.out.println("올바른 값을 입력하세요.");
			return 0;
		}
		return num1 + num2;
	}
}
