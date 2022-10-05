package section.exam01;

public class Phone {
	String company;
	String model;
	int price;
	
	void printInfo() {
		System.out.println("제조사 : " + company);
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price);
	}
	
	void setInfo(String c, String m, int p) {
		company = c;
		model = m;
		price= p;
	}
}
