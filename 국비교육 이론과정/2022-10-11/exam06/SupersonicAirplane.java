package exam06;

public class SupersonicAirplane extends Airplane {
	
	// 상수 정의
	public static final int NORMAL = 1;
	public static final int SUPERSONIC	= 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		} else {
			super.fly(); // 상위클래스의 fly() 메소드 호출
		}
	}
	
	
	
}
