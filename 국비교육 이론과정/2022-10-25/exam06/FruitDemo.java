package exam06;

public class FruitDemo {
	public static void main(String[] args) {
		// 하위타입을 상위타입에 할당
		Fruit apple1 = new Apple(); // 자동타입변환(묵시적타입변환)

		// 상위타입을 하위타입에 할당
		// 원래 Apple 타입으로 생성된 객체가
		// Fruit 타입에 할당되고 다시 Apple타입 된 경우
		Apple apple2 = (Apple) apple1; // 강제타입변환(명시적타입변환)
		
		Fruit fruit = new Fruit();
		try {
			Apple apple3 = (Apple) fruit; // ClassCastException발생(실행예외)
		} catch (Exception e) {
			System.out.println("Apple타입으로 변환할 수 없습니다.");
		}
		
		Fruit banana = new Banana();
		try {
			Apple apple4 = (Apple) banana; // ClassCastException발생
		} catch (Exception e) {
			System.out.println("Banana타입으로 변환할 수 없습니다.");
		}
	}
}


class Fruit{} // superClass(상위, 부모)
class Apple extends Fruit{} // subClass(하위, 자식)
class Banana extends Fruit{} // subClass(하위, 자식)