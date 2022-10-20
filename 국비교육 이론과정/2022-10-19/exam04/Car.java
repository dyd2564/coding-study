package exam04;

// extends 표현이 없으면 extends object와 같다.
public class Car {
	
	String name;
	String company;
	
	// 다른 생성자(매개변수가 있는 생성자)가 없으면 컴파일 시,
	// 컴파일러가 기본 생성자를 추가한다.
	
	public Car() {
		super(); // 부모 생성자 호출
		// 여기서 Car클래스의 부모 : Object (3번 줄 참고)
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	
	public Car(String name, String company) {
		this.name = name;
		this.company = company;
	}

	public static void main(String[] args) {
		Car car = new Car(); // 기본생성자 호출
		
	}
}
