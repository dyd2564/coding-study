package casting;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 0;
		
		// Byte.MIN_VALUE = -128
		// Byte.MAX_VALUE - 127
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			// byte ���� ���� �ۿ� ������
			System.out.println("byteŸ������ ��ȯ�� �� �����ϴ�.");
		} else {
			// byte ���� ���� ���� ������
			byte b = (byte) i;
			System.out.println(b);
		}
	}
}
