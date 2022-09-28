package operation;

public class DenyLogicOperationExample1 {
	public static void main(String[] args) {
		int value = 10;
		if (!(value > 20)) {
			System.out.println("value 값은 20보다 크지 않다.");
		}
		// !(10 > 20)
		// !(false)
		// true
		
		
		System.out.println(20 > 10);  // 20은 10보다 크다. true
		System.out.println(20 >= 10); // 20은 10보다 크거나 같다. true
		
		System.out.println(20 < 10);  // 20은 10보다 작다. false
		System.out.println(20 <= 10); // 20은 10보다 작거나 같다. false
		
		System.out.println(20 == 10); // 20은 10과 같다. false
		System.out.println(20 != 10); // 20은 10과 같지 않다. true
	}	
}
