package exam14;

public class Hero {
	// Hero가 Item을 가진다 hasA
	
	private int attack;
	private String name;
	private Item item; // hasA
	
	public Hero (String name, int attack, Item item) {
		this.name = name;
		this.attack = attack;
		this.item = item;
		wearEffect();
		
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
	void printInfo() {
		System.out.println("영웅의 이름 : " + name);
		System.out.println("영웅의 공격력 : " + attack);
		System.out.println("착용 아이템 이름 : " + item.getName());
		System.out.println("착용 아이템 옵션 : " + item.getOption());
	}
	
	void wearEffect() { // 착용효과
		if (this.item != null && item.getOption().equals("공격력")) {
			this.attack++;
		}
	}
}
