package casting;

public class CastingExample {
	public static void main(String[] args) {
		// int(4byte) -> char(2byte)
		int intValue = 44032;
		char charValue;
		charValue = (char) intValue;
		System.out.println(charValue);
		
		// ����Ÿ�� : long(8byte) -> int(4byte)
		long longValue = 50000000000000L;
		intValue = (int) longValue; // ������ Ÿ�� ��ȯ���� ���� ������ �ս� �Ͼ.
		System.out.println(intValue);
		
		// double(8byte) -> int(4byte)
		double doubleValue = 3.14;
		intValue = (int) doubleValue; // �Ҽ��� ������ �ս�
		System.out.println(intValue);
		
	}
}
