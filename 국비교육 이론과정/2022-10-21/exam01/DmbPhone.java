package exam01;

public class DmbPhone extends CellPhone {
	
	int channel;
	
	public DmbPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "번 방송 수신");
		
	}
	
	void turnOffDmb() {
		System.out.println("방송종료");
	}
}
