package section2.exam09;

public class Person {
	// final 필드
	// 한 번 초기화 되면 값을 변경할 수 없다.
	// 필드 선언 시 혹은 생성자에서 반드시 초기화 되어야 한다.
	final String nation;
	final String ssn;
	String name;
	
	public Person() {
		nation = "대한민국";
		ssn = "12345689";
	}
	
	// final 필드 : 생성자의 매개값으로 초기화 가능
	public Person(String nation, String ssn) {
		this.nation = nation;
		this.ssn = ssn;
	}
	
}
