package exam07;

public class Calculator {
	// �޼ҵ�
	// �������޼ҵ� == �ν��Ͻ� �޼ҵ� == non-static�޼ҵ�
	// �����޼ҵ� == Ŭ�����޼ҵ� == static�޼ҵ�
	// ���������� ����ƽ����(static) ��ȯŸ�� �̸�(�Ű�����){}
	
	void powerOn() {
		System.out.println("���� ��");
		// ���������� : ����Ʈ
		// ����ƽ���� : non-static
		// ��ȯŸ�� : ����
		// �Ű����� : ����
	}
	
	public int plus(int x, int y) {
		return x + y;
		// ���������� : public
		// ����ƽ���� : non-static
		// ��ȯŸ�� : int
		// �Ű����� : int, int
	}
	
	
	
}
