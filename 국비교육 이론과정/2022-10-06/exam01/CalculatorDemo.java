package section2.exam01;

public class CalculatorDemo {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println("���� ���� : " + cal.powerState);
		cal.powerOn();
		System.out.println("���� ���� : " + cal.powerState);
		
		System.out.println("���� ��� ��� : " + cal.plus(10, 15));
		System.out.println("������ ��� ��� : " + cal.divide(20, 6));
		
		cal.powerOff();
		System.out.println("���� ���� : " + cal.powerState);
		
	}
}
