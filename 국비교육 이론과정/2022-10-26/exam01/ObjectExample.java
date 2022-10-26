package exam01;

public class ObjectExample {
	public static void main(String[] args) {
		Object aa = new Object();
		Object bb = aa;
		Object cc = new Object();
		System.out.println(aa == bb); // 비교연산자
		System.out.println(aa.equals(bb)); // equals 메소드
		System.out.println(aa.equals(cc));
		System.out.println(aa == cc);
		
		String str1 = "abc";
		String str2 = "abc";
		// str1 str2 각각의 참조값 다름
		// str1 str2의 실제값이 같음 -> 논리적 동등
		System.out.println(str1.equals(str2));
		
	}
}
