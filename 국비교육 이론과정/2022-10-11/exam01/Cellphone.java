package exam01;

// private를 붙이면 상속이 안되니 주의!!
// 상위, 슈퍼, 부모
public class Cellphone {
	String model;
	String color;
	
	protected void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String message) {
		System.out.println("본인 : " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}
