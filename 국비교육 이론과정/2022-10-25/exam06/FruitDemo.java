package exam06;

public class FruitDemo {
	public static void main(String[] args) {
		// ����Ÿ���� ����Ÿ�Կ� �Ҵ�
		Fruit apple1 = new Apple(); // �ڵ�Ÿ�Ժ�ȯ(������Ÿ�Ժ�ȯ)

		// ����Ÿ���� ����Ÿ�Կ� �Ҵ�
		// ���� Apple Ÿ������ ������ ��ü��
		// Fruit Ÿ�Կ� �Ҵ�ǰ� �ٽ� AppleŸ�� �� ���
		Apple apple2 = (Apple) apple1; // ����Ÿ�Ժ�ȯ(�����Ÿ�Ժ�ȯ)
		
		Fruit fruit = new Fruit();
		try {
			Apple apple3 = (Apple) fruit; // ClassCastException�߻�(���࿹��)
		} catch (Exception e) {
			System.out.println("AppleŸ������ ��ȯ�� �� �����ϴ�.");
		}
		
		Fruit banana = new Banana();
		try {
			Apple apple4 = (Apple) banana; // ClassCastException�߻�
		} catch (Exception e) {
			System.out.println("BananaŸ������ ��ȯ�� �� �����ϴ�.");
		}
	}
}


class Fruit{} // superClass(����, �θ�)
class Apple extends Fruit{} // subClass(����, �ڽ�)
class Banana extends Fruit{} // subClass(����, �ڽ�)