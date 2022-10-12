package exam15;

public class Hero {

	private String name;
	private Item item;
	
	public Hero (String name) {
		this.name = name;
	}
	
	public void setItem (Item item) {
		System.out.println(name + " ������ ���� : " + item.getName());
		this.item = item;
	}
	
	public void info() {
		System.out.println("������� ����");
		System.out.println("����� : " + name);
		System.out.println("���� ������ : " + item.getName());
	}
}
