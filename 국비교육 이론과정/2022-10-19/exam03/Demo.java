package exam03;

public class Demo {

	int iValue;
	double dValue;
	boolean bool;
	String str;
	
	public static void main(String[] args) {
		// 초기화 되지 않은 로컬 변수
//		int v1;
//		double v2;
//		boolean v3;
//		System.out.println(v1);
		Demo d = new Demo();
		// 필드에서 정의된 변수들은 초기화 하지 않아고 초기화 됨.
		System.out.println(d.iValue); // 0
		System.out.println(d.bool); // false
		System.out.println(d.str); // null
		
		
	}
}
