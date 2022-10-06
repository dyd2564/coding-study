package section2.exam02;

public class CalculatorDemo {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int sum = cal.sumAll(new int[] {10, 20, 30, 40});
		System.out.println("гу╟Х : " + sum);
		
		int addAll = cal.addAll(10, 20, 30, 40, 50, 60);
		System.out.println(addAll);
		
	}
}
