package section.exam06;

public class Car {

	String company;
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		this("그랜저"); // this 메소드는 무조건 첫 줄에 와야함.
		System.out.println("기본 생성자 실행");
	}

	public Car(String model) {
		// this()는 다른 생성자
		this(model, "은색", 250);
	}
	
	public Car(String model, String color) {
		this(model, color, 250);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	void print() {
		System.out.println("제조사 : " + company);
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("최고 속도 : " + maxSpeed);
	}
	
	
}
