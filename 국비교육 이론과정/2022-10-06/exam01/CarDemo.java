package section2.exam01;

public class CarDemo {
	public static void main(String[] args) {
		
		Car car = new Car();
		int strSize = car.run("Hello");
		System.out.println("strSize : " + strSize);
		car.stop();
		car.sound();
		
		// static �޼ҵ� ȣ��
		Car.isLeftGas();
		// ���� ������ ���� ȣ��(���� x)
//		car.isLeftGas();
	}
}
