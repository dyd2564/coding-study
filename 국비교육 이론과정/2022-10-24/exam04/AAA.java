package exam04;

public class AAA {
	
	static class CCC { // 정적 멤버 클래스
		int ccc; // 인스턴스 필드
		static int ccc2; // 정적 필드
		static final int CONT_CC; // 상수
		
		static { // 스태틱 블록
			ccc2 = 12345;
			CONT_CC = 10000;
		}
		public CCC() { // 생성자
			System.out.println("정적 멤버 클래스 CCC 객체 생성");
		}
		
		// 인스턴스 메소드
		void methodA() {
			System.out.println("정적 멤버 클래스 CCC : 인스턴스 메소드");
		}
		
		// 정적 메소드
		static void methodAA() {
			System.out.println("정적 멤버 클래스 CCC : 정적 메소드");
		}
	}
}
