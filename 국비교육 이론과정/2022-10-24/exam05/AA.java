package exam05;

public class AA {

	void methodA() {
		System.out.println("methodA 호출");
		int a = 10;
		class DD {
			int dd; // 인스턴스 필드
//			static int dd2; // 정적 필드(선언 불가능)
//			static {} // static 블록(선언 불가능)
			public DD() {
				System.out.println("로컬 클래스 DD 객체 생성");
			}
			void methodD() {
				System.out.println("로컬 클래스 인스턴스 메소드 : methodD");
			}
		}
		DD dd = new DD(); // 로컬 클래스 객체 생성 : 외부에서 생성 불가능
		System.out.println(dd.dd);
		dd.methodD();
	}
	static void methodB() {
		System.out.println("methodB 호출");
		class DDD {
			int dd; // 인스턴스 필드
//			static int dd2;
//			static {}
			public DDD() {
				
			}
		}
	}
}
