package primitive;

public class OperationIntegerType {
	public static void main(String[] args) {
		byte var1 = 10;
		byte var2 = 20;
		// byte result = var1 + var2; // 컴파일 에러
		// byte 연산 시, 결과는 int 타입이 된다
		int result = var1 + var2;
		System.out.println(result);
	}
}
