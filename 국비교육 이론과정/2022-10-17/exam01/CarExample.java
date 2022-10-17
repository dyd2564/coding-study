package exam01;

public class CarExample {
	public static void main(String[] args) {
		Tire[] tires = {
				new KumhoTire("�� ���� ", 6),
				new HanKookTire("�� ������ ", 2),
				new HanKookTire("�� ���� ", 3),
				new KumhoTire("�� ������ ", 4)
		};
		
		Car car = new Car(tires);

		for (int i = 0; i < 5; i++) {
			int problemLocation = car.run();
			
			if (problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location);
				System.out.println("�ѱ�Ÿ�̾�� ��ü");
				car.tires[problemLocation-1] = 
						new HanKookTire(car.tires[problemLocation-1].location, 15);
				
			}
			
			System.out.println("--------------------------------------");
		}
		
	}
}
