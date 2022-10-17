package exam02;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle bus = new Bus();
		Vehicle taxi = new Taxi();
		Driver driver = new Driver();
		driver.drive(taxi);
		
		// DI : Dependency Injection
		// 의존성 주입
		
	}
}
