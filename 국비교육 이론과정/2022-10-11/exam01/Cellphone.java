package exam01;

// private�� ���̸� ����� �ȵǴ� ����!!
// ����, ����, �θ�
public class Cellphone {
	String model;
	String color;
	
	protected void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerff() {
		System.out.println("������ ���ϴ�.");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice(String message) {
		System.out.println("���� : " + message);
	}
	void receiveVoice(String message) {
		System.out.println("���� : " + message);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
}
