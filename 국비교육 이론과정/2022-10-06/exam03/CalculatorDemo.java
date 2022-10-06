package section2.exam03;

public class CalculatorDemo {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		double result1 = cal.avg(11, 4);
		System.out.println(result1);
		cal.executeAvg(11, 4);
	}
}
