package section2.exam01;

public class Calculator {
	
	boolean powerState;
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
		this.powerState = true;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
		this.powerState = false;
	}
	
	int plus(int x, int y) {
		if (powerState) { // ������ �����ִٸ�
			return x + y;
		}
		System.out.println("������ Ű�� ����ϼ���.");
		return 0;
	}
	
	double divide(int x, int y) {
		if (powerState) { // ������ �����ִٸ�
			return (double) x / y;
		}
		System.out.println("������ Ű�� ����ϼ���.");
		return 0;
		
	}
}
