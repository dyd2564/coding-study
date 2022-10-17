package exam04;

public class InstanceOfEample {
	public static void main(String[] args) {
		
		Apple apple = new Apple();
		Orange orange = new Orange();
		Banana banana = new Banana();
		
		checkFruitType(apple);
		checkFruitType(orange);
		checkFruitType(banana);
		
		// 하위타입 : 문자열, 상위타입 : Object
		// 하위타입은 상위타입이 될 수 없다. (true)
		System.out.println("테스트"  instanceof Object);
		
		// 상위타입은 하위타입이 될 수 없다. (false)
		// 하위타입 : 문자열, 상위타입 : Object
		Object obj = new Object();
		System.out.println(obj instanceof String);
	}

	private static void checkFruitType(Fruit obj) {
		if (obj instanceof Apple) {
			System.out.println("사과 객체");
		}
		else if (obj instanceof Orange) {
			System.out.println("오렌지 객체");
		}
		else if (obj instanceof Banana) {
			System.out.println("바나나 객체");
		}
		else {
			System.out.println("알 수 없는 객체");
		}
	}
	
}
class Fruit {}
class Apple extends Fruit {}
class Orange extends Fruit {}
class Banana extends Fruit {}