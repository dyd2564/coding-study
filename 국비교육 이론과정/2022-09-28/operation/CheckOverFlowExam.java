package operation;

public class CheckOverFlowExam {
	public static void main(String[] args) {
		// 정수 덧셈에서 오버플로우 발생 가능성
		// 두 정수의 부호가 같을 때만 발생
	
		try {
			int result = safeAdd(-2100000000, -2100000000); // 예외 발생 가능성 있음/
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static int safeAdd(int left, int right) {
		boolean allPositive = left > 0 && right > 0; // 모두 양수인 경우
		boolean allNegative = left < 0 && right < 0; // 모두 음수인 경우
		
		// 다음이 true이면 오버플로우 발생함.
		// 두 left, right 값의 합이 int 타입의 최댓값 보다 큰 경우
		boolean maxBounded = allPositive && left > Integer.MAX_VALUE -right;
		// 두 left, right 값의 합이 int 타입의 최댓값 보다 작은 경우
		boolean minBounded = allNegative && right < Integer.MIN_VALUE -left;
		
		if (maxBounded || minBounded) { // 두 조건 중 어느 하나라도 참이면 예외를 발생시킨다.
			// 예외 던짐
			throw new ArithmeticException("오버플로우 발생. 계산 불가능함."); // 예외발생
		} // 위의 if문에서 둘 다 false면 밑에 리턴 실행
		return left + right;
	}
}
