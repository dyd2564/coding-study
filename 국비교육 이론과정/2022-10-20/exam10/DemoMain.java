package exam10;

public class DemoMain {
	public static void main(String[] args) {
		// 회원가입
		// MemberService
		// 1000명이 회원가입
		// 1명당 new MemberService()가 실행 
		
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		SingleTon s3 = SingleTon.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
