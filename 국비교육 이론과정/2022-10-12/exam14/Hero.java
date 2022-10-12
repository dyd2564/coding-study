package exam14;

public class Hero {
	// Hero�� Item�� ������ hasA
	
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
		System.out.println("������ �̸� : " + name);
		System.out.println("������ ���ݷ� : " + attack);
		System.out.println("���� ������ �̸� : " + item.getName());
		System.out.println("���� ������ �ɼ� : " + item.getOption());
	}
	
	void wearEffect() { // ����ȿ��
		if (this.item != null && item.getOption().equals("���ݷ�")) {
			this.attack++;
		}
	}
}
