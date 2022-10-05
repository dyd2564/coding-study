package section.exam02;

public class CarDemo {
	public static void main(String[] args) {
		
		Car car = new Car(); // Car() 생성자 메소드(생성자 메소드는 반드시 앞에 new를 붙인다.)
		car.setInfo("현대자동차", "소나타", 200);
		car.printInfo();
		
		Car car2 = new Car("삼성", "SM3", 250);
		car2.printInfo();
	}
}
