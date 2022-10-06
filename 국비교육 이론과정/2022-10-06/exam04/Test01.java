package section2.exam04;

public class Test01 {
	public static void main(String[] args) {
		
		// 정적 변수
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(); // out도 정적 변수이다.
		
		// 정적 메서드
		System.out.println(Double.isFinite(100));
		System.out.println(Integer.parseInt("12"));
	}
}
