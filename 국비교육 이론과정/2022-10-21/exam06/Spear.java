package exam06;

public class Spear extends Item {

	private String name;

	public Spear(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String getItem() {
		return name;
	}
	
	
}
