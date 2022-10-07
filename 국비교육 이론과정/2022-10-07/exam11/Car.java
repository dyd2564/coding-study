package section2.exam11;

public class Car {
	
	private int speed;
	private boolean stop;
	
	public Car(int speed, boolean stop) {
		this.speed = speed;
		this.stop = stop;
	}

	void run() {
		System.out.println("~~~~~~~~~~~run~~~~~~~~~~");
	}
	
	// getter 메소드
	// 이름 필드의 첫글자 대문자로 변경
	// 접두사로 get을 붙임 getSpeed
	// 접근제한자 : 항상 public
	public int getSpeed() { // private된 값을 외부에서 받을 수 있게 하는 getter 메소드
		return speed;
	}
	
	// getter(boolean 타입인 경우 접두어 is를 사용한다.)
	public boolean isStop() { // private된 값을 외부에서 받을 수 있게 하는 getter 메소드
		return stop;
	}
	
	// setter
	void setSpeed(int speed) { // private된 값을 외부에서 변경할 수 있게 하는 setter 메소드
		if (speed < 0) {
			System.out.println("음의 값으로 설정 불가능");
			this.speed = 50; // 기본값으로 설정
			return;
		}
		if (speed > 200) {
			System.out.println("200초과 금지");
			this.speed = 200;
			return;
		}
		this.speed = speed;
	}
	// setter
	void setStop(boolean stop) { // private된 값을 외부에서 변경할 수 있게 하는 setter 메소드
		this.stop = stop;
	}

}
