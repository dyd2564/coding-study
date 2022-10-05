package section.exam01;

public class CarDemo {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.printInfo(); // 필드 값 설정 전
		// car1 객체 필드 값 설정
		car1.company = "현대자동차";
		car1.model = "소나타";
		car1.maxSpeed = 270;
		car1.printInfo(); // 필드 값 설정 후
		
		// car2 객체 필드 값 설정
		car2.company = "삼성";
		car2.model = "SM3";
		car2.maxSpeed = 250;
		car2.printInfo();
		
		Car car3 = new Car(); // 객체 생성
		car3.setInfo("현대자동차", "그랜저", 300); // 필드값 초기화
		car3.printInfo();
		
		
	}
}
