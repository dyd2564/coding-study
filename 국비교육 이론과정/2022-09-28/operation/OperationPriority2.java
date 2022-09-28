package operation;

public class OperationPriority2 {
	public static void main(String[] args) {
		
		// 부호 연산자
		int num1 = -10;
		int num2 = -+10;
		int num3 = -(-10);
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
		// 괄호
		int var1 = 1;
		int var2 = 2;
		int var3 = 3;
		int result = (var1 + var2) * var3;
		System.out.println("result = " + result);
	}
}
