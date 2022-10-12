package exam03.test01;

public class CellPhone {
	// public
	// protected : ���� ��Ű��, ����� Ŭ����
	
	protected boolean power;
	protected String model;
	protected String company;
	protected String phoneNumber;
	
	public CellPhone() {
		
	}
	
	public CellPhone(String model, String company, String phoneNumber) {
		this.model = model;
		this.company = company;
		this.phoneNumber = phoneNumber;
	}
	
	public void makeAPhoneCall(String dial) {
		if (!isPowerOn(this.power)) return; 
		System.out.println(dial + "��ȣ�� ��ȭ�� �̴ϴ�.");
	}
	
	protected boolean isPowerOn(boolean power) {
		if (power == false) {
		System.out.println("������ ���� �����Դϴ�.");
		}
		return power;
	}
	
	// getter gerPower(x) boolean Ÿ���̸� ���λ� is
	public boolean isPower() {
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
}
