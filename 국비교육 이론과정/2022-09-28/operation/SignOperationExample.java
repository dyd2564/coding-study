package operation;

public class SignOperationExample {
	public static void main(String[] args) {
		
		int x = -100; // ��ȣ ����
		int result1 = +x; // ��ȣ ����
		int result2 = -x; // ��ȣ ����
		
		System.out.println("result1 = " + result1); // -100
		System.out.println("result2 = " + result2); // 100
		
		short s = 100;
		byte b = 50;
		
		// ������ ���� : ������ ����� int
//		short r1 = +s;
//		short r2 = -s;
//		byte r3 = +b;
//		byte r4 = -b;
		
		int r1 = +s;
		int r2 = -s;
		int r3 = +b;
		int r4 = -b;
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
	}
}
