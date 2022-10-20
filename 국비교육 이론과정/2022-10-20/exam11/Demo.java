package exam11;

public class Demo {
	
	// final 필드 정의 시,
	// 생성자를 만들어서 정의하거나
	// 정의할때 초기화해야함
	
	final int a;
	
	public Demo(int a) {
		this.a = a;
	}
	
	public final void methodAA() {
		System.out.println("오버라이딩 예정");
	}
	
	public static void main(String[] args) {
		final int test;
		test = 10; // 초기화
//		test = 15; // 재할당
		System.out.println(test);
		Demo demo = new Demo(20); // 생성자에서 초기화
//		demo.a = 10; // 재할당 불가능(final 이라서)
		
	}
}
