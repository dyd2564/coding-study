package operation;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		int totalPiece = apple * 10;
		int onePiece = (int) (pieceUnit * 10);
		
//		double result = apple - number * pieceUnit;
		double result = (totalPiece - number * onePiece) / 10.0;
		
		System.out.println(result);
		// 정확한 계산을 위해서 정수 타입을 사용한다.
	}
}
