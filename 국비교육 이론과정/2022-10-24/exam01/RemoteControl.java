package exam01;

public interface RemoteControl {

	// �ʵ� ����(�ν��Ͻ� �ʵ� �Ұ���, ���� ����� ����)
	// final Ư���� ����, static�� Ư���� ���� => ���
	// static final ����
	// �ٸ� ��Ű������ ȣ�� ���� -> public ���������ڸ� ����
	// public static final�� Ư���� ������.
	int MAX_VOLUME = 10;
	
	// �ν��Ͻ� �Ϲ� �޼ҵ� �Ұ��� -> �ν��Ͻ� �߻�޼��常 ���
	// ���������� : public
	// abstract Ư���� ����
	// ����Ŭ����(����Ŭ����)���� �ݵ�� �������̵� �ؾ���
	void turnOn(); 
	void turnOff();
	
	// ����ƽ �޼ҵ�(�߻�޼ҵ� x) - �������̵� �Ұ���
	// ���������� :  public
	static void changeBattery() {
		System.out.println("������ ��ü");
	}
	
	// ����Ʈ �޼ҵ�(�ν��Ͻ� �޼ҵ� - �������̵� ����)
	// ������ �������̵� 
	default void defaultTest01() {
		System.out.println("����Ʈ �޼ҵ� 01");
	}
	default void defaultTest02() {
		System.out.println("����Ʈ �޼ҵ� 02");
	}
	default void defaultTest03() {
		System.out.println("����Ʈ �޼ҵ� 03");
	}
}
