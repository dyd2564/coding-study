package section.exam02;

public class Car {
	
	String company;
	String model;
	int maxSpeed;
	
	// ������ �޼ҵ�
	// �޼ҵ� �̸��� Ŭ���� �̸��� �ݵ�� �����Ͽ��� ��.
	// ��ȯ Ÿ���� ǥ������ �ʴ´�.
	// �Ű������� ���� �����ڸ� �⺻�����ڶ� �Ѵ�.
	// �⺻ �����ڸ� �����ϸ� �����Ϸ��� ������. (��, ��������...)
	public Car() {
		System.out.println("Car ��ü ����");
	}
	
	// �Ű������� �ִ� ������
	public Car(String c, String m, int ms) {
		company = c;
		model = m;
		maxSpeed = ms;
	}
	
	void setInfo(String c, String m, int ms) {
		company = c;
		model = m;
		maxSpeed = ms;
	}
	
	void printInfo() {
		System.out.println("������ : " + company);
		System.out.println("�� : " + model);
		System.out.println("�ְ�ӵ� : " + maxSpeed);
		System.out.println();
	}
}
