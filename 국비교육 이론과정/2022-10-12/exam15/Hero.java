package exam15;

public class Hero {

	private String name;
	private Item item;
	
	public Hero (String name) {
		this.name = name;
	}
	
	public void setItem (Item item) {
		System.out.println(name + " 아이템 착용 : " + item.getName());
		this.item = item;
	}
	
	public void info() {
		System.out.println("장수정보 보기");
		System.out.println("장수명 : " + name);
		System.out.println("착용 아이템 : " + item.getName());
	}
}
