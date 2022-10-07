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
	
	// getter �޼ҵ�
	// �̸� �ʵ��� ù���� �빮�ڷ� ����
	// ���λ�� get�� ���� getSpeed
	// ���������� : �׻� public
	public int getSpeed() { // private�� ���� �ܺο��� ���� �� �ְ� �ϴ� getter �޼ҵ�
		return speed;
	}
	
	// getter(boolean Ÿ���� ��� ���ξ� is�� ����Ѵ�.)
	public boolean isStop() { // private�� ���� �ܺο��� ���� �� �ְ� �ϴ� getter �޼ҵ�
		return stop;
	}
	
	// setter
	void setSpeed(int speed) { // private�� ���� �ܺο��� ������ �� �ְ� �ϴ� setter �޼ҵ�
		if (speed < 0) {
			System.out.println("���� ������ ���� �Ұ���");
			this.speed = 50; // �⺻������ ����
			return;
		}
		if (speed > 200) {
			System.out.println("200�ʰ� ����");
			this.speed = 200;
			return;
		}
		this.speed = speed;
	}
	// setter
	void setStop(boolean stop) { // private�� ���� �ܺο��� ������ �� �ְ� �ϴ� setter �޼ҵ�
		this.stop = stop;
	}

}
