package exam06;

public class Hero {
	
	private int hp;
	private int mp;
	private int maxHp = 500; // 최대 생명력
	private int maxMp = 200; // 최대 마나

	public Hero(int hp, int mp) {
		this.hp = hp;
		this.mp = mp;
	}
	
	@Override
	public String toString() {
		return "영웅정보[생명력 :" + hp + ", 마나 :" + mp + "]";
	}
	
	public void usePotion(Potion potion) {
		potion.recovery(this);
	}

	// 게터 세터
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getMaxMp() {
		return maxMp;
	}

	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}
	
	
	
}	

