package exam06;

public class AA {
	public AA a = new AA();
	public static AA aa = new AA();
	BB b = new BB();
//	static BB bb = new BB(); // static 생성 불가
	
	CC c = new CC();
	static CC cc = new CC();
	
	class BB {
		public BB() {
			System.out.println("인스턴스 클래스 : BB 객체 생성");
		}
	}
	
	static class CC {
		public CC() {
			System.out.println("인스턴스 클래스 : CC 객체 생성");
		}
	}
	
	void methodA() {
		BB b = new BB(); // 인스턴스 클래스 객체 생성
		CC c = new CC(); // 정적 클래스 객체 생성
	}
	static void methodAA() {
//		BB b = new BB(); // 인스턴스 멤버 클래스 생성 불가
		CC c = new CC(); // 정적클래스 생성 불가
	}
}
