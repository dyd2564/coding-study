package operation;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		System.out.println(result); // 0.29999999999999993
		// 실수 타입은 정확한 연산을 보장하지 않는다.
	}
}
