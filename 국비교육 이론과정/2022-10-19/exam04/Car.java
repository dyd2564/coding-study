package exam04;

// extends ǥ���� ������ extends object�� ����.
public class Car {
	
	String name;
	String company;
	
	// �ٸ� ������(�Ű������� �ִ� ������)�� ������ ������ ��,
	// �����Ϸ��� �⺻ �����ڸ� �߰��Ѵ�.
	
	public Car() {
		super(); // �θ� ������ ȣ��
		// ���⼭ CarŬ������ �θ� : Object (3�� �� ����)
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	
	public Car(String name, String company) {
		this.name = name;
		this.company = company;
	}

	public static void main(String[] args) {
		Car car = new Car(); // �⺻������ ȣ��
		
	}
}
