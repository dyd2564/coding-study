package exam07;

public abstract class Champion {
	
	int level = 1;
	int hp;
	int attack;
	static int staticfield;
	
	static {
		
	}
	
	public Champion(int hp, int attack) {
		this.hp = hp;
		this.attack = attack;
	}
	
	public void move(int x, int y) {
		System.out.printf("���� ��ǥ�� �̵�(%d, %d)\n", x, y);
	}
	
	public static void test() {
		
	}
	
	// �� è�ǿ¸��� ������ ��ų�� ����ϴ� �κ��̹Ƿ� �߻�޼���� �����.
	public abstract void useSkillQ();
	public abstract void useSkillW();
	public abstract void useSkillE();
	public abstract void useSkillR();
	
	
}
