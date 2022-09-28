package operation;

public class IncDecOperationExample4 {
	public static void main(String[] args) {
		char ch = '°¡';
		double v1 = 3.14;
		float v2 = 3.14f;
		
		System.out.println(++ch); // °¢
		System.out.println(++v1); // 4.140000000000001
		System.out.println(++v2); // 4.1400003
		
	}
}
