package casting;

public class Example01 {

	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ(������)
		byte value = 10; // 1byte(���� ����)
		int temp; // 4byte(ū ����)
		temp = value;
		
		// ������ Ÿ�� ��ȯ(�����)
		int value2 = 5; // ū ����
		byte temp2; // ���� ����
		temp2 = (byte) value2;
		
		// char : 2byte    byte : 1byte
		char test = (char) temp2;
		
		int intValue = 103029770;
		byte byteValue = (byte) intValue; // �����
		System.out.println(byteValue); // ���� Ÿ�� ��ȯ���� ���� �� �ս� �Ͼ
	}

}
