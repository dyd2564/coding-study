package section.exam01;

public class CarDemo {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.printInfo(); // �ʵ� �� ���� ��
		// car1 ��ü �ʵ� �� ����
		car1.company = "�����ڵ���";
		car1.model = "�ҳ�Ÿ";
		car1.maxSpeed = 270;
		car1.printInfo(); // �ʵ� �� ���� ��
		
		// car2 ��ü �ʵ� �� ����
		car2.company = "�Ｚ";
		car2.model = "SM3";
		car2.maxSpeed = 250;
		car2.printInfo();
		
		Car car3 = new Car(); // ��ü ����
		car3.setInfo("�����ڵ���", "�׷���", 300); // �ʵ尪 �ʱ�ȭ
		car3.printInfo();
		
		
	}
}
