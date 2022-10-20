package exam05;

public class Car {
	
	String company;
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		this("소나타", "은색", 250); // 반드시 첫 줄에 와야한다.
	}
	
	public Car(String model) {
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
	
	
}
