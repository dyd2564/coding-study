package casting;

public class FromIntToFloat {
	public static void main(String[] args) {
		// 실수 타입 = 정수 부분 + 소수 부분
		// 정수 타입 = 정수 부분
		int num1 = 1234567890;
		int num2 = 1234567890;
		float num3 = num2; // int -> float 자동 타입 변환
		num2 = (int) num3; // float -> int 강제 타입 변환
		System.out.println(num2);
		
		int result = num1 - num2;
		System.out.println(result);
		
		
	}
}
