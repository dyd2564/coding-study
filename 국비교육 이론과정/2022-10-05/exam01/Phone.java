package section.exam01;

public class Phone {
	String company;
	String model;
	int price;
	
	void printInfo() {
		System.out.println("������ : " + company);
		System.out.println("�� : " + model);
		System.out.println("���� : " + price);
	}
	
	void setInfo(String c, String m, int p) {
		company = c;
		model = m;
		price= p;
	}
}
