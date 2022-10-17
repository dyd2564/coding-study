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
		System.out.printf("다음 좌표로 이동(%d, %d)\n", x, y);
	}
	
	public static void test() {
		
	}
	
	// 각 챔피온마다 고유한 스킬을 사용하는 부분이므로 추상메서드로 만든다.
	public abstract void useSkillQ();
	public abstract void useSkillW();
	public abstract void useSkillE();
	public abstract void useSkillR();
	
	
}
