package exam06;

public class AirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();

		sa.takeOff();
		sa.fly(); // �������̵� �� ������ü �޼ҵ� ȣ��
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); // ���� ��ü �޼��� ȣ��
	}
}
