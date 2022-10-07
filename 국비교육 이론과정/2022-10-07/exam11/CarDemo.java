package section2.exam11;

public class CarDemo {
	public static void main(String[] args) {
		
		Car car = new Car(100, false);
		
		car.run();
//		car.speed = 200;
		car.setSpeed(200);
//		car.stop = true;
		car.setStop(true);
		System.out.println(car.getSpeed());
		System.out.println(car.isStop());
		
		// 음수값 설정
		car.setSpeed(-10);
		System.out.println("속도 : " + car.getSpeed());
		
		// 200초과값 설정
		car.setSpeed(500);
		System.out.println("속도 : " + car.getSpeed());
	}
	
	

}
