package exam01;

public class DmbPhone extends CellPhone {
	
	int channel;
	
	public DmbPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("ä�� : " + channel + "�� ��� ����");
		
	}
	
	void turnOffDmb() {
		System.out.println("�������");
	}
}
