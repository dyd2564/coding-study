package section2.exam01;

public class CalculatorDemo {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println("전원 상태 : " + cal.powerState);
		cal.powerOn();
		System.out.println("전원 상태 : " + cal.powerState);
		
		System.out.println("덧셈 계산 결과 : " + cal.plus(10, 15));
		System.out.println("나눗셈 계산 결과 : " + cal.divide(20, 6));
		
		cal.powerOff();
		System.out.println("전원 상태 : " + cal.powerState);
		
	}
}
