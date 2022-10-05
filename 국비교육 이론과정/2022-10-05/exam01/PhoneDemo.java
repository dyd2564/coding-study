package section.exam01;

public class PhoneDemo {
	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		
		p1.company = "APPLE";
		p1.model = "Iphone13";
		p1.price = 110;
		p1.printInfo();
		
		p2.setInfo("SAMSUNG", "Galaxy22", 100);
		p2.printInfo();
	}
}
