package operation;

public class NaNCheckExample {
	public static void main(String[] args) {
		
//		System.out.println(Double.NaN); // NaN
//		System.out.println(Float.NaN);  // NaN
		
		int x = 5;
		double d = 0.0;
		double d2 = 0.1;
		double result = x % d;
		double result2 = x / d2;
//		System.out.println(result);     // NaN
//		System.out.println(0.0 / 0.0);  // NaN
//		System.out.println(0.0 / 0.0f); // NaN
		
		boolean isNaN1 = Double.isNaN(result); // true
		boolean isNaN2 = Double.isNaN(result2); // false
		System.out.println(isNaN1);
		System.out.println(isNaN2);
		// 위 아래 같은 출력문
		System.out.println(Double.isNaN(result));
		System.out.println(Double.isNaN(result2));
	}
}
