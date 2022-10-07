package section2.exam09;

public final class PersonExample {
	public static void main(String[] args) {
		// final이 가능한 곳 : 필드(재할당 불가능), 클래스(상속 불가능)
		
		Person p = new Person();
		p.name = "홍길동";
		
		// final 필드 재할당 불가능
//		p.nation = "미국";
//		p.ssn = "러시아";
		
		Person p2 = new Person("러시아", "0000");
		p2.name = "푸틴";
//		p2.nation = "영국";
//		p2.ssn = "121212121";
	}
}
