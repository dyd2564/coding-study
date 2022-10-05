package section.exam03;

public class Car {
	String company;
	String model;
	int maxSpeed;
	
	public Car() {
	}
	
	// 기본생성자가 아닌 다른 생성자가 정의되어 있다면
	// 기본생성자를 생략할 수 없다.
	// 다른 생성자란 매개변수를 가지는 생성자를 말한다.
	
	// 매개변수가 있는 생성자.
	public Car(String c, String m, int ms) {
		company = c;
		model = m;
		maxSpeed = ms;
	}

	
}
