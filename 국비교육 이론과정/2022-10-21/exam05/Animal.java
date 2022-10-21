package exam05;

public class Animal {
	// Animal(슈퍼클래스, 큰 타입)
	// Dog, Cat(서브클래스, 작은 타입)
	
	void run() {
		System.out.println("run");
	}
	
	void cry() {}
	
	public static void main(String[] args) {
		// 작은 타입의 객체를 큰 타입에 할당 : 자동 타입 변환(Promotion), 묵시적 형변환
		Animal a1 = new Dog();
		Animal a2 = new Cat();

		// 슈퍼클래스에 할당되었을 경우
		// 슈퍼클래스에 정의된 메소드만 사용할 수 있다.
		a1.run();
		a2.run();
		a1.cry();
		a2.cry();
		
		// 서브클래스에만 정의된 메소드를 사용하려면
		// 서브클래스 타입으로 타입변환을 해야한다.
		((Dog)a1).methodA();
		((Cat)a2).methodB();
		
		// 큰 타입의 객체를 작은 타입에 할당 : 강제 타입 변환(Casting), 강제적 형변환
		// ClassCastException 예외발생
		// 슈퍼클래스로 생성된 객체를 하위타입으로 변환할 때
		Dog b1 = (Dog)new Animal();
		Cat b2 = (Cat)new Animal();
		
		// 본래 하위클래스 객체로 생성되어
		// 슈퍼클래스 타입에 할당된 객체만이
		// 강제타입변환의 대상이 된다.
		Animal c1 = new Dog();
		Dog c2 = (Dog) c1;
		
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
	void methodA() {
		System.out.println("methodA 실행");
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
	void methodB() {
		System.out.println("methodB 실행");
	}
}