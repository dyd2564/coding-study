package exam01;

public class AAA {
	int name; // 인스턴스 멤버 - 인스턴스 필드
	static String nation; // 정적멤버 - 정적필드
	public static final int MAX_VOLUME = 10; // 상수
	
	public AAA() {
		// 인스턴스 멤버 - 생성자
	}
	
	static { /* 정적 멤버 - 스태틱 블록 */ }
	void methodAA() { /* 인스턴스 멤버 : 인스턴스 메소드 */ }
	static void methodBB() { /* 정적 멤버 : 스태틱 메소드 */ }
	
	void methodCC() {
		int count = 0; // 로컬 멤버 - 로컬 변수
		public class BBB { // 로컬 멤버 - 로컬 클래스
			
		}
	}
	
	/* 클래스 멤버 : 클래스 내 위치
	   	인스턴스 멤버
	      - 인스턴스 필드
	      - 생성자
	      - 일반 메소드, 추상메소드
	    
	   	정적(스태틱) 멤버
	      - 정적 필드(상수 포함)
	      - 스태틱 블록
	      - 스태틱 메소드
	    
	   로컬 멤버
	   	  - 생성자 또는 메소드 안
	      - 로컬 변수
	      - 로컬 클래스(여기서 학습할 내용)
	      - 로컬 메소드(존재 x)
	 */
}
