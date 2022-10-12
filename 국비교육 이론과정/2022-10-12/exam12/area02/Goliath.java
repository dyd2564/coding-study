package exam12.area02;

import exam12.area01.FactoryUnit;

public class Goliath extends FactoryUnit {
	
	public static final int Max_HP = 300;
	public static final int Min_HP = 150;
	
	int airMissileAttack;
	
	public void info() {
		System.out.println("ü�� : " + hp);
		System.out.println("���ݷ� : " + attack);
		System.out.println("���� : " + defence);
	}
	
	public void repareGoliath() {
		System.out.println("���� ��� : �񸮾�");
		repare();
	}
	
	public void setHp(int hp) {
		if (hp > Max_HP) { // hp�� 300���� ū ���
			this.hp = Max_HP;
			return;
		}
		if (hp < Min_HP) { // hp�� 150���� ���� ���
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
