package exam07;

public class AA { // AA 클래스 : 외부
	 
	int aa = 10; // 외부 클래스의 인스턴스 필드
	static int bb = 10; // 외부 클래스의 정적 필드
	
	void methodA() {
		System.out.println("외부클래스의 인스턴스 메소드");
	}
	
	static void methodAA() {
		System.out.println("외부클래스의 정적 메소드");
	}
	
	class BB { // BB 클래스 : 내부 인스턴스 클래스
		void methodB() {
			System.out.println(aa); // 외부 인스턴스 필드로 접근 가능
			System.out.println(bb); // 외부 클래스의 인스턴스 필드 접근 가능
			methodA(); // 외부 클래스의 인스턴스 메소드 접근 가능
			methodAA(); // 외부 클래스의 정적 메소드 접근 가능
		}
	}
	
	static class CC { // CC 클래스 : 내부 정적 클래스
		void methodC() {
//			System.out.println(aa); // 외부 인스턴스 필드로 접근 불가능
			System.out.println(bb); // 외부 클래스의 인스턴스 필드 접근 가능
//			methodA(); // 외부 클래스의 인스턴스 메소드 접근 불가능
			methodAA(); // 외부 클래스의 정적 메소드 접근 가능
		}
	}
}
