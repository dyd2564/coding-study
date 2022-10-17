package exam05;

public class PhoneMain {
	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		Phone p2 = new Smartphone();
		Smartphone p3 = new Smartphone();
		checkType(p1);
		checkType(p2);
		checkType(p3);
	}
	
	public static void checkType(Phone obj) {
		if (obj instanceof Phone) {
			System.out.println("phone 타입");
		}
		else {
			System.out.println("Phone 타입이 아님");
		}
	}
}

class Phone{} // 상위타입
class Smartphone extends Phone {} // 하위타입 
