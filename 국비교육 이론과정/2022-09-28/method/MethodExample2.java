package method;

public class MethodExample2 {
	public static void main(String[] args) {
		// �޼ҵ� ȣ��
		System.out.println("AA �޼ҵ带 ȣ���մϴ�.");
		methodAA();
		
		System.out.println("BB �޼ҵ带 ȣ���մϴ�.");
		methodBB();
		System.out.println("���� �޼ҵ� ��.");
	}

	private static void methodAA() {
		System.out.println("�޼ҵ� AA ȣ��.");
		otherAA("Hello");
	}


	private static void methodBB() {
		System.out.println("�޼ҵ� BB ȣ��.");
	}
	
	private static void otherAA(String message) {
		System.out.println("otherAA �޼ҵ� ȣ��");
		System.out.println("���޹��� �� : " + message);
	}
}
