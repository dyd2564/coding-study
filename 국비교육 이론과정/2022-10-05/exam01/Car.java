package section.exam01;

public class Car {
	String company = "BMW";
	String model;
	int maxSpeed;
	
	void setInfo(String c, String m, int ms) {
		company = c;
		model = m;
		maxSpeed = ms;
	}
	
	void printInfo() {
		System.out.println("������ : " + company);
		System.out.println("�� : " + model);
		System.out.println("�ְ�ӵ� : " + maxSpeed);
	}
	
	
	
}
