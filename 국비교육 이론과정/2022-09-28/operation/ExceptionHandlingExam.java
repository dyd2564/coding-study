package operation;

public class ExceptionHandlingExam {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		try { // try ~ catch 문을 사용하여 예외처리
			int result = num1/num2; // 예외발생 가능성 있음
			System.out.println("result :" + result);
		} catch (ArithmeticException e) {
			// ArithmeticException예외가 발생하면 이 블록 실행
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
		}
		
	}
}
