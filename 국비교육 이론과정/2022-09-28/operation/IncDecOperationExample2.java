package operation;

public class IncDecOperationExample2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		
		int result1 = ++x + 5; // x : 11 결과 : 16
		int result2 = y++ + 5; // y : 10 결과 : 15
		System.out.println(result1);
		System.out.println(result2);
		
	}
}
