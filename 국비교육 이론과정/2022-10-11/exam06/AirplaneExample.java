package exam06;

public class AirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();

		sa.takeOff();
		sa.fly(); // 오버라이딩 된 상위객체 메소드 호출
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); // 하위 객체 메서드 호출
	}
}
