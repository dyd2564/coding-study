package section2.exam08;

public class SingleTonExample {
	public static void main(String[] args) {
		// 싱글톤이란?
		// 하나의 어플리케이션 내에서 단 하나만 생성되는 객체
		
		// 싱글톤 얻는 방법
		// 클래스 변수 1 = 클래스.getInstance();
		
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		SingleTon obj3 = SingleTon.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
