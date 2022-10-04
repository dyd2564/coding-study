package ref_type;

public class ReferenceVarExample {
	public static void main(String[] args) {
		// 참조타입 변수 비교연산
		String var1 = "홍길동"; // 리터럴 방식
		String var2 = "홍길동"; // 리터럴 방식
		String var3 = new String("홍길동");
		String var4 = new String("홍길동");
		
		System.out.println(var1 == var2); // true
		System.out.println(var3 == var4); // false
		System.out.println(var1 == var3); // false
		System.out.println(var2 == var4); // false
		
		System.out.println(var1.equals(var4)); // true
		System.out.println(var3.equals(var4)); // true
	}
}
