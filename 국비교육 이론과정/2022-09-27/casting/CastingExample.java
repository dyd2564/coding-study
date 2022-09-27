package casting;

public class CastingExample {
	public static void main(String[] args) {
		// int(4byte) -> char(2byte)
		int intValue = 44032;
		char charValue;
		charValue = (char) intValue;
		System.out.println(charValue);
		
		// 정수타입 : long(8byte) -> int(4byte)
		long longValue = 50000000000000L;
		intValue = (int) longValue; // 강제적 타입 변환으로 인해 데이터 손실 일어남.
		System.out.println(intValue);
		
		// double(8byte) -> int(4byte)
		double doubleValue = 3.14;
		intValue = (int) doubleValue; // 소수점 데이터 손실
		System.out.println(intValue);
		
	}
}
