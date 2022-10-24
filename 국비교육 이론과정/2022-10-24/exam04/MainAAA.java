package exam04;

public class MainAAA {
	public static void main(String[] args) {
		System.out.println(AAA.CCC.ccc2);
		System.out.println(AAA.CCC.CONT_CC);
		
		AAA.CCC.methodAA(); // 정적 메소드 호출
		AAA.CCC c = new AAA.CCC();
		c.methodA(); // 인스턴스 메소드 호출
		c.methodAA(); // 정적 메소드 호출
	}
}
