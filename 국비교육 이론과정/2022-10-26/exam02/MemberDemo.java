package exam02;

public class MemberDemo {
	public static void main(String[] args) {
		
		Member member1 = new Member(1, "홍길동");
		Member member2 = new Member(1, "홍길동");
		Member member3 = new Member(2, "홍길동");
		// 오버라이딩 전 : 비교연산자와 equals메소드 동일하게 동작함
		// 오버라이딩 후 : equals메소드 논리적 동등 판단
		System.out.println(member1 == member2);
		
		// member1과 member2는 논리적 동등이다.
		System.out.println(member1.equals(member2));
		
		// member1과 member3은 논리적 동등이 아니다.
		System.out.println(member1.equals(member3));
	}
}
