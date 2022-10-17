package exam05;

public class PhoneMain2 {
	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		Phone p2 = new Smartphone();
		Smartphone p3 = new Smartphone();
		checkType(p1);
		checkType(p2);
		checkType(p3);
	}
	
	public static void checkType(Phone obj) {
		if (obj instanceof Smartphone) {
			System.out.println("Smartphone 타입");
		}
		else {
			System.out.println("SmartPhone 타입이 아님");
		}
	}
}
