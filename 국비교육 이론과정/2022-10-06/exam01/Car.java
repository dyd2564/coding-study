package section2.exam01;

public class Car {
	
	// �ν��Ͻ� �޼ҵ�(������)
	// non-static �޼ҵ�
	// ��ü�� �������� ����
	// ��ü ���� �� ȣ�� �ȴ�.
	// ���� ������ ���� ȣ�� car.run()
	int run(String message) {
		System.out.println("run �޼ҵ� ����");
		System.out.println("���޵� �Ű��� : " + message);
		return message.length();
	}
	
	void stop() {
		System.out.println("stop �޼ҵ� ����");
		System.out.println();
	}
	
	void sound() {
		System.out.println("sound �޼ҵ� ����");
	}
	
	// static �޼ҵ�(����)
	// ��ü ���� ������ ���� ���� ����� �� ����.
	// Ŭ������.�޼ҵ�� Car.isLeftGas()
	static void isLeftGas() {
		System.out.println("isLeftGas");
	}
}
