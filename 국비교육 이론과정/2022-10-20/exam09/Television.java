package exam09;

public class Television {
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	String color;
	
	public Television(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "색깔 : " + color;
	}

	// 인스턴스 메소드
	void methodA() {
		System.out.println("methodA");
		System.out.println(this);
	}
	
	static {
		info = company + model;
		// 인스턴스필드 초기화 안됨.
		// 객체 생성의 보장이 없음
//		color = "빨강";
//		methodA();
	}
	
	public Television() {
//		info = company + model;
		// 스태틱 멤버 : 언제나 사용가능
		// 인스턴스 멤버 : 객체가 생성이 되어야 사용가능
		// 생성자 내에서 인스턴스 멤버 사용
		// 생성자 - 객체 생성
	}
}
