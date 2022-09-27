package casting;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10; // 2byte 정수
		int intValue = byteValue; //  자동 타입 변환 byte -> int
		System.out.println(intValue); // intValue : 10
		
		char charValue = '가'; // 2byte
		intValue = charValue; // 재할당(intValue : 44032) char -> int
		System.out.println(intValue);
		
		intValue = 500; // 4byte
		long longValue = intValue; // 8byte  int -> long
		System.out.println(longValue);
		
		
	}
}
