package exam12.area02;

import exam12.area01.FactoryUnit;

public class Goliath extends FactoryUnit {
	
	public static final int Max_HP = 300;
	public static final int Min_HP = 150;
	
	int airMissileAttack;
	
	public void info() {
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + attack);
		System.out.println("방어력 : " + defence);
	}
	
	public void repareGoliath() {
		System.out.println("수리 대상 : 골리앗");
		repare();
	}
	
	public void setHp(int hp) {
		if (hp > Max_HP) { // hp가 300보다 큰 경우
			this.hp = Max_HP;
			return;
		}
		if (hp < Min_HP) { // hp가 150보다 작은 경우
			this.hp = Min_HP;
			return;
		}
		this.hp = hp;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public void setDefence(int defence) {
		this.defence = defence;
	}

	
	
}
