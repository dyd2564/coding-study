package section2.exam04;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int result1 = cal.areaRectangle(10);
		int result2 = cal.areaRectangle(10, 5);
		
		System.out.println("길이가 10인 정사각형 넓이 : " + result1);
		System.out.println("가로, 세로 길이가 각각 10, 5인 직사각형 넓이 : " + result2);
	}
	
}
