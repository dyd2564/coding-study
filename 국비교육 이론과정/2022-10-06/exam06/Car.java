package section.exam06;

public class Car {

	String company;
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		this("�׷���"); // this �޼ҵ�� ������ ù �ٿ� �;���.
		System.out.println("�⺻ ������ ����");
	}

	public Car(String model) {
		// this()�� �ٸ� ������
		this(model, "����", 250);
	}
	
	public Car(String model, String color) {
		this(model, color, 250);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	void print() {
		System.out.println("������ : " + company);
		System.out.println("�� : " + model);
		System.out.println("���� : " + color);
		System.out.println("�ְ� �ӵ� : " + maxSpeed);
	}
	
	
}
