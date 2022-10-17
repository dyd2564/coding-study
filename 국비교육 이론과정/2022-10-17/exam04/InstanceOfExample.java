package exam04;

public class InstanceOfExample {
	public static void main(String[] args) {
		
		boolean result1 = "테스트" instanceof String;
		Object obj1 = new Object();
		boolean result2 = obj1 instanceof Object;
		System.out.println(result1);
		System.out.println(result2);
		
		boolean result3 = obj1 instanceof String;
		System.out.println(result3);
		boolean result4 = "테스트" instanceof Object;
		System.out.println(result4);
	}
}
