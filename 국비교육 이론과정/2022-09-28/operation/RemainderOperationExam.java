package operation;

public class RemainderOperationExam {
	public static void main(String[] args) {
		// 나머지 연산자 %
		
		// 우측 피연산자 0으로 연산하는 경우
//		System.out.println(10 % 0); // 오류 발생
		
		char ch1 = '가'; // 44032
		char ch2 = 'A'; // 65
		int result = ch1 % ch2; // 계산 결과가 int이므로 result를 int로 정의
		System.out.println(result);
		
		// 피연산자가 음수인 경우
		int num1 = -10;
		int num2 = -3;
		System.out.println(num1 % num2); // -1
		// -10 % |-3|
		// -10 % 3
		// -1
		
		int num3 = 10;
		int num4 = -3;
		System.out.println(num3 % num4); // 1
		// 10 % |3|
		// 10 % 3
		// 1
	}
}
