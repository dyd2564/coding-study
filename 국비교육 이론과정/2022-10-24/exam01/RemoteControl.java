package exam01;

public interface RemoteControl {

	// 필드 선언(인스턴스 필드 불가능, 오직 상수만 가능)
	// final 특성을 가짐, static의 특성을 가짐 => 상수
	// static final 생략
	// 다른 패키지에서 호출 가능 -> public 접근제한자를 가짐
	// public static final의 특성을 가진다.
	int MAX_VOLUME = 10;
	
	// 인스턴스 일반 메소드 불가능 -> 인스턴스 추상메서드만 허용
	// 접근제한자 : public
	// abstract 특성을 가짐
	// 실제클래스(구현클래스)에서 반드시 오버라이딩 해야함
	void turnOn(); 
	void turnOff();
	
	// 스태틱 메소드(추상메소드 x) - 오버라이드 불가능
	// 접근제한자 :  public
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
	
	// 디폴트 메소드(인스턴스 메소드 - 오버라이드 가능)
	// 선택적 오버라이딩 
	default void defaultTest01() {
		System.out.println("디폴트 메소드 01");
	}
	default void defaultTest02() {
		System.out.println("디폴트 메소드 02");
	}
	default void defaultTest03() {
		System.out.println("디폴트 메소드 03");
	}
}
