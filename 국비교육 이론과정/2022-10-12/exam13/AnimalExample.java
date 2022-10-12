package exam13;

public class AnimalExample {
	public static void main(String[] args) {
		// long 타입 > int 타입
		long longValue = 10;
		int intValue = 10;
		
		// int 타입을 long 할당 (자동 형변환, 묵시적 형변환)
		long longTemp = intValue;
		// long 타입을 int에 할당 (강제 형변환, 명시적 형변환)
		int intTemp = (int) longValue;
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		// Cat, Dog를 Animal 타입에 할당 (자동 형변환)
		Animal a1 = dog;
		Animal a2 = cat;
		Animal a3 = new Dog();
		Animal a4 = new Cat();
		
		// Animal을 Cat, Dog 타입에 할당 (강제 형변환)
		Dog dog2 = (Dog) new Animal();
		Cat cat2 = (Cat) new Animal();
		
		
		
	}
}

class Animal {
	// 슈퍼 클래스 : Animal (크기가 큰 타입이라 생각하자)
	// 서브 클래스 : Dog, Cat (크기가 작은 타입이라 생각하자)	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}