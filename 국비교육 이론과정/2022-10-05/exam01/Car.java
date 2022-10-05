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
		System.out.println("제조사 : " + company);
		System.out.println("모델 : " + model);
		System.out.println("최고속도 : " + maxSpeed);
	}
	
	
	
}
