package casting;

public class Example01 {

	public static void main(String[] args) {
		// 자동 타입 변환(묵시적)
		byte value = 10; // 1byte(작은 상자)
		int temp; // 4byte(큰 상자)
		temp = value;
		
		// 강제적 타입 변환(명시적)
		int value2 = 5; // 큰 상자
		byte temp2; // 작은 상자
		temp2 = (byte) value2;
		
		// char : 2byte    byte : 1byte
		char test = (char) temp2;
		
		int intValue = 103029770;
		byte byteValue = (byte) intValue; // 명시적
		System.out.println(byteValue); // 강제 타입 변환으로 인한 값 손실 일어남
	}

}
