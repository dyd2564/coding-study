package exam01;

public class DmbPhoneExample {
	public static void main(String[] args) {
		
		// DmbCellPhone ��ü ����
		DmbCellphone dmbPhone = new DmbCellphone("�ڹ���", "����", 10);
		
		// CellPhone���� ���� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbPhone.model);
		System.out.println("���� : " + dmbPhone.color);
		
		// DmbCellPhone�� �ʵ�
		System.out.println("ä�� : " + dmbPhone.channel);
		
		// CellPhone���� ���� ��ӹ��� �޼ҵ� ȣ��
		dmbPhone.powerOn();
		dmbPhone.bell();
		dmbPhone.sendVoice("��������?");
		dmbPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�.");
		dmbPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbPhone.hangUp();
		
		// DmbCellPhone�� �޼ҵ� ȣ��
		dmbPhone.turnOnDmb();
		dmbPhone.changeChnnelDmb(12);
		dmbPhone.turnOffDmb();
		
		
	}
}
