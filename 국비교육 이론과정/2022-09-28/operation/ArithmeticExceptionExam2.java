package operation;

public class ArithmeticExceptionExam2 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 4;
		double result = (double)num1 / num2; // 결과가 int이므로 double로 강제 타입 변환 필요
		
		System.out.println(result);
	}
}
