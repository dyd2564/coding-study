package exam03;

public class PhoneMain {
	public static void main(String[] args) {
		// ����Ÿ�� ��ü�� �����ǰ�
		// ����Ÿ�� ���������� �Ҵ� �Ǹ鼭 ����Ÿ������
		// �ڵ� Ÿ�� ��ȯ �Ǿ���.
		
		Phone phone = new Phone(); // ����Ʈ���� ����Ÿ��
//		SmartPhone sm = (SmartPhone) phone;
		
		Phone ph2 = new SmartPhone();
		SmartPhone sm2 = (SmartPhone) ph2;
		ph2.makeAPhoneCall();
		sm2.playApp("��Ʃ��");
		
	}
}
