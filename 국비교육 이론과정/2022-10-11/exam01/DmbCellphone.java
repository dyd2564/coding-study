package exam01;

public class DmbCellphone extends Cellphone {
	
	int channel;
	
	public DmbCellphone(String model, String color, int channel) {
		this.model = model; // Cellphone���� ���� ��ӹ��� �ʵ�
		this.color = color; // Cellphone���� ���� ��ӹ��� �ʵ�
		this.channel = channel;
				
	}
	
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ����� �����մϴ�.");
	}
	
	void changeChnnelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä���� " + channel + "������ �����մϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ������ �ߴ��մϴ�.");
	}
}
