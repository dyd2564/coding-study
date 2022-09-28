package method;

public class MethodExample4 {
	public static void main(String[] args) {
		
		System.out.println("메인 메소드 시작");
		
		int num1 = 12;
		int num2 = 11;
		int result = add(num1, num2);
		System.out.println(result);
		
		int addResult = add(10, 2);
		System.out.println(addResult);
		
		double divideResult = divide(10, 4);
		System.out.println(divideResult);
		
		System.out.println("메인 메소드 끝");
		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double divide(double a, double b) {
		return a / b;
	}
}
