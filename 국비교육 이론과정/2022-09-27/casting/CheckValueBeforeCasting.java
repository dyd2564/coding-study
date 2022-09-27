package casting;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 0;
		
		// Byte.MIN_VALUE = -128
		// Byte.MAX_VALUE - 127
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			// byte 저장 범위 밖에 있으면
			System.out.println("byte타입으로 변환할 수 없습니다.");
		} else {
			// byte 저장 범위 내에 있으면
			byte b = (byte) i;
			System.out.println(b);
		}
	}
}
