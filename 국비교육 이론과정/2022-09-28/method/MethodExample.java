package method;

public class MethodExample {
	// ���� �޼ҵ�
	// String[]     args       -> �Ű�����
	// (�Ű����� Ÿ��) (�Ű����� �̸�)
	// �Ű����� = �μ� = ���� = �Ķ����
	public static void main(String[] args) {
		
		System.out.println("���θ޼ҵ带 ������.");
		
		String greeting = "�ȳ��ϼ���?"; // ���ڿ� ������
		System.out.println("proceed �޼ҵ带 ȣ���մϴ�.");
		proceed(greeting);
		System.out.println("���� �޼ҵ� ��.");
	}
	
	public static void proceed(String message) { // message = "�ȳ��ϼ���?"
		System.out.println("proceed �޼ҵ尡 ȣ���.");
		System.out.println("���� ���� �޼��� ��� : " + message);
	}
}
