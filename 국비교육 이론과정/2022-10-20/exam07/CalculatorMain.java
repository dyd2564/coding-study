package exam07;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn();
		int result = cal.plus(10, 5);
		System.out.println(result);
		System.out.println(cal.plus(10, 5));
	}
}
