package exam01;

public class CellPhone {
	
	private String model;
	private String color;
	
	protected CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원 on");
	}
	
	void powerOff() {
		System.out.println("전원 off");
	}
	
	protected void bell() {
		System.out.println("ring~~~");
	}
}
