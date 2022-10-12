package exam14;

public class Item {
	
	private String name; // 아이템 이름
	private String option; // 아이템 옵션
	
	public Item(String name, String option) {
		this.name = name;
		this.option = option;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
}
