package section_modifier;

public class AAADemo {
	public static void main(String[] args) {
		// AAADemo클래스와 AAA클래스는 동일한 패키지 내 존재
		// 디폴트 접근제한자를 가지는 AAA클래스의 인스턴스를 생성할 수 있음.
		AAA aa = new AAA();
		
		// public 접근자의 BB클래스
		BB bb = new BB();
	}
}
