package exam08;

public class Demo3 {
	
	static int test = 15;
	
	static void methodBB() {
		System.out.println("스태틱메소드BB");
	}
	
	// 스태틱 멤버
	public static void main(String[] args) {
		System.out.println(Calculator.field);
		// 객체 생성 없이 호출 가능
		Calculator.methodAA();
		
		// 객체 생성하고 호출
		Calculator c = new Calculator();
		System.out.println(c.field);
		c.methodAA();
		System.out.println("====================");
		System.out.println(Demo3.test);
		System.out.println(test);
		methodBB();
		Demo3.methodBB();
	}
}
