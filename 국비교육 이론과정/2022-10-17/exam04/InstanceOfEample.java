package exam04;

public class InstanceOfEample {
	public static void main(String[] args) {
		
		Apple apple = new Apple();
		Orange orange = new Orange();
		Banana banana = new Banana();
		
		checkFruitType(apple);
		checkFruitType(orange);
		checkFruitType(banana);
		
		// ����Ÿ�� : ���ڿ�, ����Ÿ�� : Object
		// ����Ÿ���� ����Ÿ���� �� �� ����. (true)
		System.out.println("�׽�Ʈ"  instanceof Object);
		
		// ����Ÿ���� ����Ÿ���� �� �� ����. (false)
		// ����Ÿ�� : ���ڿ�, ����Ÿ�� : Object
		Object obj = new Object();
		System.out.println(obj instanceof String);
	}

	private static void checkFruitType(Fruit obj) {
		if (obj instanceof Apple) {
			System.out.println("��� ��ü");
		}
		else if (obj instanceof Orange) {
			System.out.println("������ ��ü");
		}
		else if (obj instanceof Banana) {
			System.out.println("�ٳ��� ��ü");
		}
		else {
			System.out.println("�� �� ���� ��ü");
		}
	}
	
}
class Fruit {}
class Apple extends Fruit {}
class Orange extends Fruit {}
class Banana extends Fruit {}