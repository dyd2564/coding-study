package section.exam04;

public class Korean {
	
	static String id = "ABCD";
	
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 가독성을 향상시키기 위해 this로 구분
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	void print() {
		System.out.println("국적 : " + nation);
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + ssn);
		System.out.println();
	}
}
