package section.exam02;

public class Car {
	
	String company;
	String model;
	int maxSpeed;
	
	// 생성자 메소드
	// 메소드 이름은 클래스 이름과 반드시 동일하여야 함.
	// 반환 타입은 표시하지 않는다.
	// 매개변수가 없는 생성자를 기본생성자라 한다.
	// 기본 생성자를 생략하면 컴파일러가 삽입함. (단, 조건있음...)
	public Car() {
		System.out.println("Car 객체 생성");
	}
	
	// 매개변수가 있는 생성자
	public Car(String c, String m, int ms) {
		company = c;
		model = m;
		maxSpeed = ms;
	}
	
	void setInfo(String c, String m, int ms) {
		company = c;
		model = m;
		maxSpeed = ms;
	}
	
	void printInfo() {
		System.out.println("제조사 : " + company);
		System.out.println("모델 : " + model);
		System.out.println("최고속도 : " + maxSpeed);
		System.out.println();
	}
}
