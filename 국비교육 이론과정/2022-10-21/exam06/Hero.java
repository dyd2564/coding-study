package exam06;

public class Hero {
	
	String name;
	Item item;
	
	public Hero(String name) {
		this.name = name;
	}
	
	
	public void info() {
		System.out.println("�̸� : " + this.name);
		System.out.println("������ : " + item.getItem());
	}


	public void setItem(Item item) {
		this.item = item;
	}

	
	
	
}
