package exam06;

public class Hero {
	
	String name;
	Item item;
	
	public Hero(String name) {
		this.name = name;
	}
	
	
	public void info() {
		System.out.println("이름 : " + this.name);
		System.out.println("아이템 : " + item.getItem());
	}


	public void setItem(Item item) {
		this.item = item;
	}

	
	
	
}
