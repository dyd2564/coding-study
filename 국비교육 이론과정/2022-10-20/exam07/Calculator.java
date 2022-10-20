package exam07;

public class Calculator {
	// 메소드
	// 비정적메소드 == 인스턴스 메소드 == non-static메소드
	// 정적메소드 == 클래스메소드 == static메소드
	// 접근제한자 스태틱여부(static) 반환타입 이름(매개변수){}
	
	void powerOn() {
		System.out.println("전원 켬");
		// 접근제한자 : 디폴트
		// 스태틱여부 : non-static
		// 반환타입 : 없음
		// 매개변수 : 없음
	}
	
	public int plus(int x, int y) {
		return x + y;
		// 접근제한자 : public
		// 스태틱여부 : non-static
		// 반환타입 : int
		// 매개변수 : int, int
	}
	
	
	
}
