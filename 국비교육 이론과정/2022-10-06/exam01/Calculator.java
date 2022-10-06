package section2.exam01;

public class Calculator {
	
	boolean powerState;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
		this.powerState = true;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
		this.powerState = false;
	}
	
	int plus(int x, int y) {
		if (powerState) { // 전원이 켜져있다면
			return x + y;
		}
		System.out.println("전원을 키고 사용하세요.");
		return 0;
	}
	
	double divide(int x, int y) {
		if (powerState) { // 전원이 켜져있다면
			return (double) x / y;
		}
		System.out.println("전원을 키고 사용하세요.");
		return 0;
		
	}
}
