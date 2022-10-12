package exam06;

public class Airplane extends Object{
	
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
	
	public void fly() { // 오버라이딩 대상
		System.out.println("일반비행");
	}
}
