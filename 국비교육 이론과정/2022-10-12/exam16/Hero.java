package exam16;

public abstract class Hero { // �߻�Ŭ����
	// �ʵ�, �Ϲ� �޼ҵ�, ������, �߻� �޼ҵ�
	// new �����ڷ� ��ü���� �Ұ�
	
	int hp;
	
	void move() {
		System.out.println("�̵��մϴ�.");
	}
	
	void attack() {
		System.out.println("�����մϴ�.");
	}
	
	abstract void useUlt();
}
