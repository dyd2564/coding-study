package exam13;

public class AnimalExample {
	public static void main(String[] args) {
		// long Ÿ�� > int Ÿ��
		long longValue = 10;
		int intValue = 10;
		
		// int Ÿ���� long �Ҵ� (�ڵ� ����ȯ, ������ ����ȯ)
		long longTemp = intValue;
		// long Ÿ���� int�� �Ҵ� (���� ����ȯ, ����� ����ȯ)
		int intTemp = (int) longValue;
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		// Cat, Dog�� Animal Ÿ�Կ� �Ҵ� (�ڵ� ����ȯ)
		Animal a1 = dog;
		Animal a2 = cat;
		Animal a3 = new Dog();
		Animal a4 = new Cat();
		
		// Animal�� Cat, Dog Ÿ�Կ� �Ҵ� (���� ����ȯ)
		Dog dog2 = (Dog) new Animal();
		Cat cat2 = (Cat) new Animal();
		
		
		
	}
}

class Animal {
	// ���� Ŭ���� : Animal (ũ�Ⱑ ū Ÿ���̶� ��������)
	// ���� Ŭ���� : Dog, Cat (ũ�Ⱑ ���� Ÿ���̶� ��������)	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}